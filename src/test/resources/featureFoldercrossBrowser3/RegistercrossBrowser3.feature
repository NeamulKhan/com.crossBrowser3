@Registration

Feature: User Registration on Always Fashion

Scenario: Launch website and Navigate to Registration Page

Given User launches the Always Fashion website 
Then verify website homepage load successfully
When User clicks on the user icon and clicks the Registration link
Then User should be navigated to the Registration page

Scenario: Successful registration with valid details

Given User is on the registration page
When User select gender
When User enters the following details:
      | Field           | Value              |
      | First Name      | John               |
      | Last Name       | Smith              |
      | Email           | johnsm1@example.com |
      | Date of Birth   | 6                  |
      | Month of Birth  | July               |
      | Year of Birth   | 1976               |
      | Country         | Canada             |
      | Phone Number    | 506-234-5678       |
      | Password        | 123456             |
      | Confirm Password | 123456            |
And User agrees to the terms and conditions
And User clicks on the Register button
Then User should be successfully registered
And User should see a successful registration message