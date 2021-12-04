Feature: Test ContactPage Functionality
Scenario: Enter Details in Contact page

Given Launch Cogmento Application
When User provide valid "<Username>"
|Username|
|gakshata19@gmail.com|
And Valid "<Password>"
|Password|
|Aksh$123|
Then Click on LoginButton
When User is on Home Page
Then Click on ContactLink and CreateButton
Then Enter All Details
Then Click on SaveButton
Then Close the browser

