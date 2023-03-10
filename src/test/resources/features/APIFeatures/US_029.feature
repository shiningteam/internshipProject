@US029_Api_Test

Feature: Country Validation

  Scenario: TC03_POST_Request
    Given user sends POST request for the create a new country
    Then user validates the creation of country

  Scenario: TC03_GET_Request
    Given user sends GET request for the read new country
    Then user validates the read of country

  Scenario: TC03_PUT_Request
    Given user sends PUT request for the update the new country name
    Then user validates the update of country

  Scenario: TC03_DELETE_Request
    Given user sends DELETE request for the update the new country name
    Then user validates the delete of country