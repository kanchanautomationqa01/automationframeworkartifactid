Feature: Salesforce login 

Scenario Outline: login with positive credentials
Given I have landed on login page
When I enter "<username>" in username field
And I enter "<password>" in password field
Then click on log in button

Examples:
|username          |password     |
|kanchan@gmail.com |kanchan123   |     
|aditya@gmail.com  |aditya@123   |