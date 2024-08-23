Feature: Login page feature

Scenario: Login page title
Given user is on login page
When user gets the title of the page
Then page title should be like "OrangeHRM"

@sanity
Scenario: Forgot Password link
Given user is on login page
Then forgot your password link should be displayed

@regression
Scenario: Login with correct credentials
Given user is on login page
When user entered username "Admin"
And user enters password "admin123"
And user click on Login button

Examples:
|username|   |password|
|Admin|      |admin123|
|Admin123|	  |admin123|
|admin|				|admin123|	 







