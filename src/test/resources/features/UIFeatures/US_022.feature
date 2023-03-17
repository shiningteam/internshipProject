@US022_UI_Test
  Feature: Show appointments for patients by Staff

    Background:
      Given User goes to home page and Sign in with staff credentials
      And Navigate to "search-patient"  page and searches patient with SSN
      And View and  Verifies that the patient searched with SSN is displayed
      And Click Show Appointments button and verify

    Scenario: TC_01, TC_02, TC_03 Staff edit appointments
      Then Click edit button from an appointment and verify
      Then Select the status from dropdown and verify
      Then Leave blank Anamnesis, Treatment, Diagnosis and verify
      Then Close the application

    Scenario: TC_04 Staff can select the current doctor that needs to be selected for the patient
      Then Click edit button from an appointment and verify
      Then Select Physician from dropdown and verify
      Then Close the application

    Scenario:TC_05 Staff can view the patients test results
      Then Click Show Tests button from an appointment and verify
      Then Close the application






