Feature: Employee product order list page verification

Scenario: Login as an Employee
Given I am in Landing Page
When I Click on Login
And I Will see Employee Login Page
Then I Enter user id "testpilot@gmail.com"
And I Enter password "1234"
When I click login button
Then I Will see "Employee Home Page"
When  I click order List button
Then I Will see order product list page