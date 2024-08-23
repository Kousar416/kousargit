Feature: verify the videoGame API



  Scenario: verify the Get Request for all

    Given I have the videogame endpoint "api/v2/videogame"

    When I have send the get request

    Then the videogame response status should be 200

    And the videogame json should have "Resident Evil 4"



  Scenario: verify the Post Request for all

    Given I have the videogame endpoint "api/v2/videogame"

    When I have send the get request with a body

    Then The videogame should give statuscode 415

    And The videogame jsonfile should have "id"



  Scenario: verify the put request for videogame

    Given I have the videogame endpoint for put "api/v2/videogame/2"

    When I have send the put request for viddeogame

    Then The videogame should give statuscode for put is 200

    And the videogame should have update "date"



  Scenario: verify the delete fro videogame

    Given I have the endpoint to delete "api/v2/videogame/2"

    When I have send the delete request for videogame

    Then the videogame should give me a statuscode of 200
    
    
    
    
    
    
    
    