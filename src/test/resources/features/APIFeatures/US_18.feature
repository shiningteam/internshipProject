@US018_ApiTestItem

Feature: Test Item Validation

  @US018_PostRequest
  Scenario: POST_Request
    Given user sends POST request to create a new test item
    Then user gets the data and validates the creation of the test item

  @US018_GetRequest
  Scenario:GET_Request
    Given user sends GET request to read new test item
    Then user gets the data and validates test item


  @US018_DeleteRequest
  Scenario: DELETE_Request
    Given user sends DELETE request to delete  the updated test item
    Then user validates the deletion of test item


  @US018_DeleteRequest
  Scenario:GET_Request
  user sends get request to validate the deleted test item



