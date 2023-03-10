@US029_DB_Test
Feature: Country Validation

  Scenario: Validate Country by Country ID

    Given user connects to database
    When get all "ID" as a list from "Countries"
    Then verify countryId contains "7751"
    And close the connection