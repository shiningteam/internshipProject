@PatientInvoice
Feature: Appointmentes by patients

  Background:
        Given The user verifies he is in the  home page

    Scenario: TC01_A patient should be able to see the test results.
        And The user verifies he is logged in as a patient.
        When Click on MY PAGES(PATIENT) button.
        And Click on My Appointments option.
        And Click on Show Tests button to be able to see the related test result.
        And Click on View Results button.
        Then Verifies that there can be seen  id, name for test, default max and min value, test date and description.

