@US_016_UI
  Feature: US_016_UI
    Background: go_to_home_page
    Given user (Admin) goes to home page

    Scenario Outline: US_016_TC_001_Admin should be able to create patient and see all patient information
    When Click Patients link
    And  Click Create a new Patient button
    Then Verify see all patient information
    And  Enter the required fields
    Then Verify the "<State>" should be provided as USA state and cannot be blank
    Then Verify creating the new patient succesfully
      Examples:
        | State |
        | USA   |
        |       |







