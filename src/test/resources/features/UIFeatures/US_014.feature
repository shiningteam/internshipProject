@US014
  Feature: US_014
    Background:

      Given Go to home page and sign in
      And   User clicks on MY PAGES dropdown and select My Appointments option
      And   Click on edit button


    Scenario: US_014_TC001 Physician should be able to see all test information
      When Click on Show Test Results button
      Then Click on View Results button
      Then See all test information.

    Scenario: US_014_TC002
      When User clicks on Request Inpatient button
      Then Click on MY PAGES dropdown and select My Inpatients option
      Then Verify the requested patient is on the inpatient list.

