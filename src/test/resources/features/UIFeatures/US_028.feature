@admin_messages
  Feature:messages
    Background:
        Given go to home page
        And   Verify that admin is in home page
        And   sign in as admin
        And   Verify that admin is logged in
        When  Click on Items&Titles button
        And   Click on Messages option

    Scenario: TC01-Admin sees all messages their author and email
        Then  The messages ,their authors and emails should be displayed

    Scenario: TC02-Admin should create  new message
        And   Click  on Create a new Message button
        And   Fill in the blanks with required information
        And   Click on Save button
        Then  Verify that success message

    Scenario: TC03-Admin should update the message
        And   Click  on Edit button of  created message
        And   Change  the message
        And   Click on Save button
        Then  Verify that updated success message

    Scenario: TC04-Admin should delete the message
        And   Click  on Delete button of  created message
        And   Confirm delete operation and click on "Delete" button
        Then  Verify that deleted success message








