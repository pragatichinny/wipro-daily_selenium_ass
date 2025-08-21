Feature: validate login page
Scenario Outline: check for valid and invalid credentials
Given login page should be open in default browser
When click on login button and enter  <username1>
And add <password1>
And click on signin button check <status>
Then login successfully and open home page
Examples:
|username1|password1|status|
|452145|password|fail|
|username|452d45r5|fail|
|452145|gfg4511|fail|
|username|password|pass|