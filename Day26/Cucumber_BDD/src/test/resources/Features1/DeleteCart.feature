Feature: Remove item from cart
Scenario: Delete item from cart
Given user added item to cart
When click on cart icon
And click on remove
Then item deleted from cart