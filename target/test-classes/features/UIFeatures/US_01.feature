@Register
  Feature: registration

    Background:

      Given Go to home page
      When Click Signin button at the top
      Then Click Register button


    Scenario: US_001_registration
      And User enters "SSN"
      And user enters "firstName"
      And user enters "lastName"
      And user enters "username"
      And user enters "email"
      And user enters "password"
      And user confirms "password"
      And user clicks "registration button"
      And user asserts the registration is succesfull


