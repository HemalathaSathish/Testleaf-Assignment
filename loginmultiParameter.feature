Feature: Login Functionality of Testleaf application

Scenario Outline: Login with valid credentials
Given Launch the Browser
Given Load the URL
Given Enter the userName <uName>
Given Enter the passWord <uPword>
When Click on loginButton
Then Login to logoutPage
But Click on logOut Button		

Examples:
|uName|uPword|
|'DemoSalesManager'|'crmsfa'|
|'DemoSalesManager'|'crm'|
