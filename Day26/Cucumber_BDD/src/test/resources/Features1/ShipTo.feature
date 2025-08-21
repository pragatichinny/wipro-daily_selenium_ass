Feature: Ship To features
Scenario: validate ship to
Given ebay Home page
When click on ship to
And click on shipping location select location
And click on done
Then ship location updated