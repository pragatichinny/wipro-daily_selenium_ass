Feature: validate the login page
Scenario: Login functionality
Given page should open in default browzer
When  click on sing in 
And click on username and enter email click on continue button
And click on password and enter password click on submit
Then login successfully