@US_016_API
Feature: US016_API

  Scenario: US_016_TC_001_Get_Request_Creating_Patient

    Given user sends GET request for created patient
    Then  verify the created patient's information


