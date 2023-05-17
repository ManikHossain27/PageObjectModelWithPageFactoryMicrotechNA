Feature: Verify Admin login and alert massage Handle

Scenario: Alert Massage Handle
Given I am in Landing Page
When I Click on Login
And Click Admin Login
Then I enters User Id "admin@gmail.com"
And I enters Password "admin"
When I will click Login button
Then I will seenn "Admin Home Page"
Then I click Employee Button
And I clcik Employee Leave Button
Then I click reason of leave for exam approve button
Then I click alert message OK
Then refresh URL
Then I will see the status of "approved"