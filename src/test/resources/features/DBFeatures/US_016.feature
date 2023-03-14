@US_016_DB
Feature:US_016_DB
  Scenario: Verify the created patient
    Given User(admin) connects to database
    When  Get all "first_name" as a list from "patient"
    Then  Verify patientsList contains patients  created by adminteam01
    And   Close the connection
