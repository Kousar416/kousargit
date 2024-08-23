package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ReqresSteps {
	private Response response;

	 @Given("I have the endpoint {string}")

	 public void i_have_the_endpoint(String endpoint)

	 {

	  RestAssured.baseURI="https://reqres.in";

	  RestAssured.basePath=endpoint;

	 }

	 @When("I send the GET request")

	 public void i_send_the_get_request()

	 {

	  response =RestAssured.get();

	 }

	 @Then("the response status code should be {int}")

	 public void the_response_status_code_should_be(Integer int1)

	 {

	  response.then().statusCode(200);

	 }

	 @Then("the response body should contain {string}")

	 public void the_response_body_should_contain(String string)

	 {

	  String jsonString = response.asString();

	  System.out.println(jsonString);

	  if(jsonString.contains("George"))

	  {

	   System.out.println("The value users is present");

	   

	  }else

	  {

	   System.out.println("The value users is not present");

	  }

	 }

	 @Given("I have given the endpoint {string}")

	 public void i_have_given_the_endpoint(String endpoint) 

	 {

	     RestAssured.baseURI = "https://reqres.in";

	     RestAssured.basePath = endpoint;

	 }

	 @When("I send the POST request with an body")

	 public void i_send_the_post_request_with_an_body()

	 {

	 String jsonString = "{\r\n"
	 + " \"name\": \"morpheus\",\r\n"
	 + " \"job\": \"leader\"\r\n"
	 + "}";
	 
	 response = RestAssured.given().body(jsonString).post();

	 }

	 @Then("the response status code is {int}")

	 public void the_response_status_code_is(Integer int1)

	 {

	  response.then().statusCode(201);

	 }

	 @Then("the response body should contains the {string}")

	 public void the_response_body_should_contains_the(String string) {

	 String jsonString = response.asPrettyString();

	 System.out.println(jsonString);

	 if (jsonString.contains("George")) 

	 {

	     System.out.println("The Post is created");

	 }

	 else {

	     System.out.println("The Post Request got failed");

	 }



	 }

	 @Given("I had given endpoint {string}")

	 public void i_had_given_endpoint(String endpoint) 

	 {

	   RestAssured.baseURI = "https://reqres.in";

	   RestAssured.basePath = endpoint;

	 }
	 
	 
	 @When("I send the Put request with an body")
	 public void i_send_the_put_request_with_an_body() {
	 String jsonString = "{\r\n"
	 + " \"name\": \"morpheus\",\r\n"
	 + " \"job\": \"zion residents\"\r\n"
	 + "}";


	 response = RestAssured.given().body(jsonString).put();
	 }


	 @Then("response status code is {int}")
	 public void response_status_code_is(Integer int1) {
	 response.then().statusCode(200);
	 }


	 @Then("the response body contains the {string}")
	 public void the_response_body_contains_the(String string) {
	 String updatedata = response.jsonPath().getString("updatedAt");
	 System.out.println(updatedata);
	 if (updatedata.isEmpty())
	 {
	 System.out.println("The Put is updated");
	 }
	 else {
	 System.out.println("The Put Request got failed");
	 }
	    }


	 @Given("I had the endpoint {string}")
	 public void i_had_the_endpoint(String endpoint)
	 {
	   RestAssured.baseURI = "https://reqres.in";
	   RestAssured.basePath = endpoint;
	 }


	 @When("I send the Patch request with an body")
	 public void i_send_the_patch_request_with_an_body()
	 {

	 String jsonString = "{\r\n"
	 + " \"name\": \"morpheus\",\r\n"
	 + " \"job\": \"zion resident\"\r\n"
	 + "}";

	 response = RestAssured.given().body(jsonString).patch();
	 }



	 @Then("response status code be {int}")
	 public void response_status_code_be(Integer int1)
	 {
	    response.then().statusCode(200);
	 }



	 @Then("the response body able to contains the {string}")
	 public void the_response_body_able_to_contains_the(String string)
	 {
	    String updatedata = response.jsonPath().getString("updatedAt");
	    System.out.println(updatedata);
	    if (updatedata.isEmpty()) {
	    System.out.println("The Patch is updated");
	 }
	 else  {
	      System.out.println("The Patch Request got failed");
	   }
	 }


	 @Given("I had able to get the endpoint {string}")
	 public void i_had_able_to_get_the_endpoint(String endpoint)
	 {
	       RestAssured.baseURI = "https://reqres.in";
	       RestAssured.basePath = endpoint;
	 }



	 @When("I send the delete request")
	 public void i_send_the_delete_request()
	 {
	     response = RestAssured.delete();
	 }


	 @Then("response status code must be {int}")
	 public void response_status_code_must_be(Integer int1)
	 {
	      response.then().statusCode(204);



	 }

	    


	

}



