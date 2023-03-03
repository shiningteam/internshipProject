@Register
  Feature: registration

    Background:
      Given User Goes to "https://www.medunna.com/"
      When Click Signin button at the top
      Then Click Register button


    Scenario Outline: US_001_TC1
      Then User enters SSN
      Then user enters firstName
      Then user enters lastName
      Then user enters username
      Then user enters email
      Then user enters password
      Then user confirms password
      Then user clicks registration button

      Examples: User Information