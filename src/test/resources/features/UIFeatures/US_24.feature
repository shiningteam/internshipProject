
@US24InvoiceProcess

Feature: TestItem_feature

  Background:

  Scenario:Display the patient searched with SSN
    Given User goes to home page and Sign in with staff credentials
    And Navigate to "search-patient"  page and searches patient with SSN
    Then View and  Verifies that the patient searched with SSN is displayed

  Scenario:Check the invoice process
    Then Verifies that patient's status is COMPLETED
    Then Verifies that all invoice is visible
    Then Verifies  that the invoice sent to the patient is visible
    Then Close the application

