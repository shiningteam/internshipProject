@US018_DB_Test
Feature: Test Item Validation

  Scenario: Validate Test Item by Name

    Given user connects to database
    When get all "name" as a testlist from "c_test_item"
    Then verify testNameList contains "cholestrol5"
    And close the connection

  Scenario: Validate Test Item by ID

    Given user connects to database
    When get all "id" as a Idlist from "c_test_item"
    Then verify Idlist contains "21927"
    And close the connection

