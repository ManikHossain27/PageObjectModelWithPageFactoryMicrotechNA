Feature: Customer Profile Login page.

Scenario: Login as an Customer
Given I am in Landing Page
When I Click on Login
And Click Customer Login
Then I enter User Id "david@gmail.com"
And I enter Password "1234"
When I click Login button
Then I will see "Customer Home Page"