@TestResults

  Feature: TestResults

    Background:

      Given User goes to home page url
      When Click Signin buttn at the top

    Scenario:
      When user enters "username"
      Then user enters "password"
      Then user clicks sign in

  Scenario:
    Then User clicks my pages
    And User clicks search patient bar
    And User enters a valid ssn number into search box
    And User clicks show appointments
    And user clicks show tests
    And user clicks view the results
    And user clicks edit button
    And user sends value to result bar
    And user clicks save button
#  And user verifies is the result editable
