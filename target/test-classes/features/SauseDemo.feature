Feature: Sause Demo Project


Scenario: Login with valid details
Given user in login page
When user enters username "<username>"
And user enters pasword "pasword"
And user clicks on Login button

Scenario: user is on product page
Given user in login page
When user enters username "standard_user"
And user enters pasword "secret_sauce"
And user clicks on Login button
And user is on the Swag Labs product page


@sanity
Scenario: user is on cart page
Given user in login page
When user enters username "standard_user"
And user enters pasword "secret_sauce"
And user clicks on Login button
And user is on the Swag Labs product page
And user clicks on the add to cart button
And user is on add to cart page
Then user clicks on checkout button


@regression
Scenario:user is on checkout info page
Given user in login page
When user enters username "standard_user"
And user enters pasword "secret_sauce"
And user clicks on Login button
And user is on the Swag Labs product page
And user clicks on the add to cart button
And user is on add to cart page
Then user clicks on checkout button
And user is on checkout page
And user enters First "Mahi"
And user enters Last "Shaik"
And user enters Postalcode "215487"
Then user clicks on continue button



@sanity
Scenario: user is on overview page
Given user in login page
When user enters username "standard_user"
And user enters pasword "secret_sauce"
And user clicks on Login button
And user is on the Swag Labs product page
And user clicks on the add to cart button
And user is on add to cart page
Then user clicks on checkout button
And user is on checkout page
And user enters First "Mahi"
And user enters Last "Shaik"
And user enters Postalcode "215487"
Then user clicks on continue button
And user is on overview page
Then user clicks on first button



Examples:
|username|			|pasword|
|standard_user|	 |secret_sauce|
|Standard_User|	 |Secret_Sauce|
|STANDARD_USER|	 |SECRET_SAUCE| 	

 