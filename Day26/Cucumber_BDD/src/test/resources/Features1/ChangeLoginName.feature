Feature: Change Login Display Name
Scenario: Update display name in profile
Given User is logged in
When User navigates to Account settings
And User changes Name
Then User should see as the login name
