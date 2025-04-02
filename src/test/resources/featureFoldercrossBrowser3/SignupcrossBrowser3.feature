@Signup

Feature: User signup functionality

Scenario: Successful signup with valid details
Given User is on the signup page
When User select gender male
When User enters the following details in signup feilds:
|Field            | Value               |
|FirstName        | John                |
|LastName         | Smith               |
|Email            | johnsm1@example.com |
|Date_of_Birth    | 6                   |
|Month_of_Birth   | July                |
|Year_of_Birth    | 1976                |
|Country          | Canada              |
|PhoneNumber      | 506-234-5678        |
|Password         | 123456              |
|Confirm_Password | 123456              |
And User check to the terms and conditions
And User clicks on the signup button
Then User should be successfully signedup

 