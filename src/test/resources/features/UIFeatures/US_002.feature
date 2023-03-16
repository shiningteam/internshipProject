@US002_UI_Test
  Feature: Username and email address
    Background:
      Given User goes to homepage
      When Click "register" button

    Scenario: TC_01 Register with valid username and email address
      Then Enter valid username "mervemermer2023" with letters and numbers
      And Enter valid email address "mervemermer2023@gmail.com"

    Scenario: TC_03 Register fails if username is blank
      Then Leave username box blank
      And Enter valid email address "mervemermer2023@gmail.com"
      And Assert that username is not accepted

    Scenario Outline: TC_04, TC_05, TC_06 Register fails with invalid email address
      Then Enter invalid "<email address>"
      And Assert that email is not accepted

      Examples:
        | email address        |
        | mervemermer@gmailcom |
        | mervemermer          |
        | mervemermergmail.com |

    Scenario: TC_07 Register fails if email address is blank
      Then Leave email address box  blank
      And Assert that user gets error message
