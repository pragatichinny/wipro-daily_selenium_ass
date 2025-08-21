Feature: search in zeroBank
Scenario Outline: search feature
Given Home page should be open in default browser
When click on search bar and enter <search1>
Then verifies search functionalities
Examples:
|search1|
|online banking|
|funds transfer|
|My money map|
|Account Activity|
|pay Bills|