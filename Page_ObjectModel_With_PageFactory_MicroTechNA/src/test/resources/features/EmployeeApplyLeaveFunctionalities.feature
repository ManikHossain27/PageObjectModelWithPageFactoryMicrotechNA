Feature: Employee Apply leave functionalities

Scenario: Login as an Employee
Given I am in Landing Page
When I Click on Login
And I Will see Employee Login Page
Then I Enter user id "testpilot@gmail.com"
And I Enter password "1234"
When I click login button
Then I Will see "Employee Home Page"
When I Click Apply leave button
Then I See employee leave Page
Then I write reason for apply leave
Then I Enter Start Date
Then I Enter End Date
Then I will click submit button
Then I will refresh Url
Then I will see Apply leave reason and Status