@Register
Feature: registration


  Background:

    Given User goes to home page url
    When Click Signin buttn at the top
    Then Click Registers button


  Scenario: US_001_TC1
    Then User enters SSN
    Then user enters firstName
    Then user enters lastName
    Then user enters username
    Then user enters email
    Then user enters "password"
    Then user confirms "password"
    Then user clicks registration button

