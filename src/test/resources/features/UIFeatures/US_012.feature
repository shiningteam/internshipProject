@US12
Feature: US_12

  Background:

    Given Go to home page and sign in
    And   User clicks on MY PAGES dropdown and select My Appointments option
    And   Click on edit button

  Scenario Outline: US012_TC01
    And  Verify user see patiet's id such as "<id>","<start_date>","<end_date>","<status>","<physician>"
    And  User types in required fields
    Then Verify the required fields can be typed
    Then close the application

    Examples: data
      | id    | start_date | end_date   | status  | physician        |
      | 10566 | 03.04.2023 | 03.04.2023 | COMPLETED | ShiningPhysician |

    Scenario: US012_TC02
      When Only numbers are to be entered in the description field.
      Then Verify the edit is done succesfully
      Then Verify there is no error if only numbers are to be entered in the description field.
      Then Close the application











