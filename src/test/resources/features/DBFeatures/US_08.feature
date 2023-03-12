@US08_DB_Test
Feature: Appointment Validation

  Scenario: Validate Appointment by Appointment ID

    Given user connects to database
    When get all "id" as a list from "appointment"
    Then verify countryId contains 1251
    And close the connection