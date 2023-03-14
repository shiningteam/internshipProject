@US18TestItem
Feature: TestItem_feature

  Background:

  Scenario Outline:Create test items
    Given User goes to home page and Sign in
    And Navigate to Test Item page
     And Clicks "Create a new Test Item" box
     And Enters all required fields such as "<Name>", "<Description>", "<Price>", "<Default_min_value>", "<Default_max_value>"
     And Clicks "Save" button
     Then View and verify the created test item
#     Then close application

    Examples:test_data
      | Name          | Description             |Price   |Default_min_value    |Default_max_value    |
      |HDL cholesterol|High density lipoprotein |25      |40                   |60                   |


  Scenario Outline: Updates the created test items
    Then Finds the test item to be updated
    Then Updates it filling all required fields such as "<Name>", "<Description>", "<Price>", "<Default_min_value>", "<Default_max_value>"
    Then Verifies that the test item is updated
#    Then close application

    Examples:test_data
      | Name          | Description                |Price   |Default_min_value    |Default_max_value    |
      |LDL cholesterol|Low density lipoprotein     |35      |100                  |129                  |



  Scenario: Delete test items
   Then Finds the test item and delete it verify the created test item
   Then Verifies that the test item is deleted
   Then close application






