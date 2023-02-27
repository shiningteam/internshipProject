@patient_appointment
Feature: patient appointment
  @user_appointment_negative
  Scenario Outline: test appointments

    Given user clicks on  MyPages(Patient) button
    And user selects  and clicks on the "Make an Appointment"
    And user enters the appointment name "<firstName>"
    And user enters the appointment lastname "<lastName>"
    And user enters ssn and email "<ssn>" and "<email>"
    When user enters the phone number "<phone>"
    And user enters the unvalid "<date>"
    Then user requests appointment and verifies the error message
    Examples: test data

      | email                    | firstName      | lastName | phone        | ssn         | date       |
      | shiningpatient@gmail.com | ShiningPatient | Team     | 123-456-7890 | 777-77-7777 | 02-24-2023 |