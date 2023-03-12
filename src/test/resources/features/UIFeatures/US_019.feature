@US_019_UI
Feature: Create_Staff

  Background:
    Given User goes to home page
    When Admin clicks user button at the top
    And  Admin clicks signin button

  Scenario Outline:

    And Admin fills the user name part "<AdminUsername>" and password part "<AdminPassword>" click sinin button
    And Admin click Items&Titles and click Staff button
    And Clicks Create a Staff button
    And Clicks Use Snn radio button
    And writes a registered "<SSN>" to confirm
    Then Assert that User found with search SSN is displayed

    Examples: users credentials
      | AdminUsername | AdminPassword | SSN         |
      | AdminTeam01   | Team01+       | 333-33-5332 |
