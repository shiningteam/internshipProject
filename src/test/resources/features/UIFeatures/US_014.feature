@US14
Feature: US_14
  Background:
    When Navigate to home page and sign in
    And  Clicks on MY PAGES dropdown and select My Appointments option
    And  Clicks on edit button


  Scenario Outline: US_014_TC_001
    When Physician clicks on request a test
    And  Select required "<tests>"
    And  Click on Show Test Results button
    Then Verify see all "<tests>" information and "<tests info>"

    Examples: tests
      | tests         | tests info         |
      | Urea          | ID                 |



  Scenario Outline: US_014_TC002
    When User clicks on Request Inpatient button
    And  Click on MY PAGES dropdown and select My Inpatients option
    Then Verify the requested patient is on the "<inpatients>" list

    Examples: inpatients

      |inpatients|
      |ShiningPatient|




