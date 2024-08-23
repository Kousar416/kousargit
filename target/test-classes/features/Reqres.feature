Feature: Rest API



  Scenario: Verify get request api

    Given I have the endpoint "/api/users"

    When I send the GET request

    Then the response status code should be 200

    Then the response body should contain "users"



  Scenario: Verify post request API

    Given I have given the endpoint "/api/users"

    When I send the POST request with an body

    Then the response status code is 201

    And the response body should contains the "ID"



  Scenario: Verify the put request API

    Given I had given endpoint "/api/users/2"

    When I send the Put request with an body

    Then response status code is 200

    And the response body contains the "update"



  Scenario: Verify the patch request API

    Given I had the endpoint "/api/users/2"

    When I send the Patch request with an body

    Then response status code be 200

    And the response body able to contains the "updated"



  Scenario: Verify the delete request API

    Given I had able to get the endpoint "/api/users/2"

    When I send the delete request

    Then response status code must be 204
    
    
    
    