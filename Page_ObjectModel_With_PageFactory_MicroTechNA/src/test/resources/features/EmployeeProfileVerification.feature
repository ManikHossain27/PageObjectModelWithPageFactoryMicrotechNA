Feature: Employee profile verification

Scenario: Login as an Employee
Given I am in Landing Page
When I Click on Login
And I Will see Employee Login Page
Then I Enter user id "testpilot@gmail.com"
And I Enter password "1234"
When I click login button
Then I Will see "Employee Home Page"
Then  I click My Profile button
Then I will seen "My Info Page"
