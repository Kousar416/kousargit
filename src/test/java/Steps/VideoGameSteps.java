package Steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class VideoGameSteps {
	
	private Response response;

	@Given("I have the videogame endpoint {string}")
	public void i_have_the_videogame_endpoint(String endpoint) {
		RestAssured.baseURI="https://videogamedb.uk";
		RestAssured.basePath=endpoint;

	}
	
	@When("I have send the get request")
	public void i_have_send_the_get_request(){
		response = RestAssured.get();
		response.prettyPrint();
	}

	@Then("the videogame response status should be {int}")
	public void the_videogame_response_status_should_be(Integer int1) {
		assertEquals(response.getStatusCode(),int1.intValue());
	}

	@Then("the videogame json should have {string}")
	public void the_videogame_json_should_have(String string) {
		String jsonString = response.asPrettyString();
		if(jsonString.contains(string)){
			System.out.println("The value  is present");
		}else{
			System.out.println("The value  is not present");
		}

	}

	@When("I have send the get request with a body")
	public void i_have_send_the_get_request_with_a_body() {
		String json ="{\r\n"
				+ "  \"category\": \"Platform\",\r\n"
				+ "  \"name\": \"Mario\",\r\n"
				+ "  \"rating\": \"Mature\",\r\n"
				+ "  \"releaseDate\": \"2012-05-04\",\r\n"
				+ "  \"reviewScore\": 85\r\n"
				+ "}\r\n"
				+ "}";
		response = RestAssured.given().body(json).post();   
	}

	@Then("The videogame should give statuscode {int}")
	public void the_videogame_should_give_statuscode(Integer int1) {
		assertEquals(response.getStatusCode(),int1.intValue());
		
	}
	
	@Then("The videogame jsonfile should have {string}")
	public void the_videogame_jsonfile_should_have(String string) {
String jsonString = response.asPrettyString();
		if(jsonString.contains(string))
		{
			System.out.println("The post request is done");
		}else{
			System.out.println("The post  is not done");
		}
	}

	@Given("I have the videogame endpoint for put {string}")
	public void i_have_the_videogame_endpoint_for_put(String endpoint) {
		RestAssured.baseURI="https://videogamedb.uk";
		RestAssured.basePath=endpoint;
	}

	@When("I have send the put request for viddeogame")
	public void i_have_send_the_put_request_for_viddeogame() {
		String json ="{\r\n"
				+ "  \"category\": \"Platform\",\r\n"
				+ "  \"name\": \"Mario\",\r\n"
				+ "  \"rating\": \"Mature\",\r\n"
				+ "  \"releaseDate\": \"2012-05-04\",\r\n"
				+ "  \"reviewScore\": 85\r\n"
				+ "}\r\n"
				+ "}";

		response = RestAssured.given().body(json).header("Content-type","application/json")
				.header("Accept","application/json").put(); 
	}

	@Then("The videogame should give statuscode for put is {int}")
	public void the_videogame_should_give_statuscode_for_put_is(Integer int1) {
		assertEquals(response.getStatusCode(),int1.intValue());
	}

	@Then("the videogame should have update {string}")
	public void the_videogame_should_have_update(String string) {
	String jsonString = response.asPrettyString();
		if(jsonString.contains(string))
		{
			System.out.println("The put request is done");
		}else{
			System.out.println("The put  is not done");
		}
	}

	@Given("I have the endpoint to delete {string}")
	public void i_have_the_endpoint_to_delete(String endpoint) {
		RestAssured.baseURI="https://videogamedb.uk";
		RestAssured.basePath=endpoint;
	}

	@When("I have send the delete request for videogame")
	public void i_have_send_the_delete_request_for_videogame() {
	   response = RestAssured.delete();
	}
	
	@Then("the videogame should give me a statuscode of {int}")
	public void the_videogame_should_give_me_a_statuscode_of(Integer int1) {
		assertEquals(response.getStatusCode(),int1.intValue());

	}

}
	

