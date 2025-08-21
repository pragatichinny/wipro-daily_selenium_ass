Feature: Update Address
Scenario: Update current shipping address
Given User should logged in
When User navigates to Address Book
And User updates address 
Then The updated address should be saved successfully
