Feature:API testing

Scenario: Verify get request api
Given I have the endpoint "/api/users"
When I send the GET request
Then the responseee status code should be 200
And the response body should contain "email"
