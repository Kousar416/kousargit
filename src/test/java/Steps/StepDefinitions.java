//package Steps;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.restassured.RestAssured;
//import io.restassured.response.Response;
//
//public class StepDefinitions {
//	
//	private Response response;
//	
//	@Given("I have the endpoint {string}")
//	public void i_have_the_endpoint(String endpoint) {
//		RestAssured.baseURI="https://reqres.in";
//		RestAssured.basePath=endpoint;
//	    
//	}
//
//	@When("I send the GET request")
//	public void i_send_the_get_request() {
//	    response= RestAssured.get();
//	}
//
//	@Then("the response status code should be {int}")
//	public void the_response_status_code_should_be(Integer int1) {
//		response.then().statusCode(int1);
//	    
//	}
//
//	@Then("the response body should contain {string}")
//	public void the_response_body_should_contain(String string) {
//		
//		String jsonString=response.asString();
//		
//		if (jsonString.contains("users")) {
//			System.out.println("The value user is present");
//		}else {
//			System.out.println("The value users is not present");
//		}
//	    
//	}
//
//
//}
