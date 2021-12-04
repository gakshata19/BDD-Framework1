Feature: Test Cogmento CRM Application
Scenario Outline: Test Login Functionality

Given Open cogmento crm application
When User enter valid "<username>" and "<password>"
Then Click on login button
Then Go to home page
And Close browser

Examples:
|username | password |
|gakshata19@gmail.com | Aksh$123|
|vinodkhandare445@gmail.com | Vinod@321|
