Feature: search in eBay
Scenario Outline: search functionalities
Given Home page should be open in default browser with login
When click on search and enter <search2>
Then search funtionalities work fine
Examples:
|search2|
|bag|
|iphone|
|laptop|
