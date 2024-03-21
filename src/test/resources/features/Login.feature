Feature: Login functionality

Scenario: Login with valid credentials
Given User has navigated to login page
When User enters valid email address "faisaljamil0827@gmail.com" into email field
And User has entered valid password "Test@1234" into password field
And User clicks on Login button
Then User should get successfully logged in

Scenario: Login with invalid credentials
Given User has navigated to login page
When User enters invalid email address "faitest1211@gmail.com" into email field
And User enters invalid password "1234567" into password field
And User clicks on Login button
Then User should get a proper warning message about credentails mismatch

Scenario: Login with valid email and invalid password
Given User has navigated to login page
When User enters valid email address "faisaljamil0827@gmail.com" into email field
And User enters invalid password "1234567" into password field
And User clicks on Login button
Then User should get a proper warning message about credentails mismatch

Scenario: Login with invalid email and valid password
Given User has navigated to Login page
When User enters invalid email address "faitest1211@gmail.com" into email field
And User enters valid password "Test@1234" into password field
And User clicks on Login button
Then User should get a proper warning message about credentails mismatch
 
Scenario: Login without providing any credentials
Given User has navigated to Login page
When User dont enter email address into email field
And User dont enter password into password field
And User clicks on Login button
Then User should get a proper warning message about credentails mismatch
