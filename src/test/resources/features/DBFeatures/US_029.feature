@US029_DB_Test
Feature: Country Validation

  Scenario: Validate Country by Country ID

    Given user connects to database
    When get all "name" as a list from "Country"
    Then verify countryName contains "Italy"
    And close the connection