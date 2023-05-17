Feature: Employee Invalid password Verification

Scenario: Login as an Employee
Given I am in Landing Page
When I Click on Login
And I Will see Employee Login Page
Then I Enter user id "testpilot@gmail.com"
And I Will Enter password "1234"
When I click on login button
Then I see "Invalid user name and password"
