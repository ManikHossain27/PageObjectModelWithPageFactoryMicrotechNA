Feature: Customer Profile Verification Feature

Scenario: Login as an Customer
Given I am in Landing Page
When I Click on Login
And Click Customer Login
Then I enter User Id "david@gmail.com"
And I enter Password "1234"
When I click Login button
Then I will see "Customer Home Page"
Then I will click My Profile
Then I will seen "MyInfo"
Then I will see My First & Last name
Then I will see Email Address
Then I will see Date of Birth & Gender
Then I will see contact number
Then I will see Address 
