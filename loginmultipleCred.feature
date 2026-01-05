Feature: Login Functionality of Testleaf application

Scenario: Login with valid credentials
Given Launch the Browser
Given Load the URL
Given Enter the userName 'DemoSalesManager'
Given Enter the passWord 'crmsfa'
Given Click on loginButton
Then Login to logoutPage		

Scenario: Login with invalid credentials
Given Launch the Browser
Given Load the URL
Given Enter the userName 'DemoSalesManager'
Given Enter the passWord 'crm'
Given Click on loginButton
Then Login to logoutPage   
And Click on LogoutButton