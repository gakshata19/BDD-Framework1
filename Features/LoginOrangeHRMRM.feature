Feature: Test OrangeHRM Application login functionality
Scenario: login functionality

Given Open OrangeHRM application
When user enter valid credientials
|Admin|admin123|
Then User clicks on login button
Then user is on home page
Then Close Application