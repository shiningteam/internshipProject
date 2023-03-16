@US_002_ApiTest

  Feature: Username and email address - Api Test

    Scenario: User should be validated username and email address by sending "GET" request
      Given user sends GET request for accounts
      Then user validates username and email address

    Scenario: User should be validated the username is unique by sending "GET" request
      Given user sends GET request for accounts
      Then user validate that the username is unique
