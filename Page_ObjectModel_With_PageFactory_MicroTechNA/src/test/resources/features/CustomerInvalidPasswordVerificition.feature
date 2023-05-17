Feature: Invalid pass msg show in login page

Scenario: Login as an Customer
Given I am in Landing Page
When I Click on Login
And Click Customer Login
Then I enter emailid "david@gmail.com"
And I enter Passwordd "1256"
When I click loginn button 
Then I will check "Invalid user name and password"