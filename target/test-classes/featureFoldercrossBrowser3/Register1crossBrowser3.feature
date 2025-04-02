@Registration1

Feature: User enters details in Registration form

Scenario: Successful registration with valid details

Given User is on the registration page
When User select gender
When User enters the following details:
      | Field           | Value              |
      | FirstName      	| John               |
      | LastName       	| Smith              |
      | Email           | johnsm1@example.com|
      | Date_of_Birth   | 6                  |
      | Month_of_Birth  | July               |
      | Year_of_Birth   | 1976               |
      | Country         | Canada             |
      | PhoneNumber    	| 506-234-5678       |
      | Password        | 123456             |
      | Confirm_Password| 123456             |
And User agrees to the terms and conditions
And User clicks on the Register button
Then User should be successfully registered
And User should see a successful registration message