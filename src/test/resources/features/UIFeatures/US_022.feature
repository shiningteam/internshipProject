@US022_UI_Test
  Feature: Show appointments for patients by Staff

    Background:
      Given User goes to home page and Sign in with staff credentials
      And Navigate to "search-patient"  page and searches patient with SSN
      Then View and  Verifies that the patient searched with SSN is displayed
      Then Click Show Appointments button and verify

    Scenario: TC_01, TC_02, TC_03, TC_04, Staff edit appointments
      Then Click edit button from an appointment and verify
      Then Select the status from dropdown
      Then Verify options are selectable
      Then Verify COMPLETED option is not selectable
      Then Leave blank Anamnesis, Treatment, Diagnosis
      Then Verify  not need to provide Anamnesis, Treatment or Diagnosis as required fields
      Then Select Physician from dropdown
      Then Verify Physcian is selectable

    Scenario: TC_05 Staff can view the patients test results
      Then Click Show Tests button from an appointment
      Then Verify test results are displayed






