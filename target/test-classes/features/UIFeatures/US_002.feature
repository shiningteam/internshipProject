@US002_Merve
  Feature: Username and email address
<<<<<<< HEAD
=======

>>>>>>> master
    Background:
      Given User goes to homepage
      When Click "register" button

    Scenario: TC_01 Register with valid username and email address
      Then Enter valid username "mervemermer2023" with letters and numbers
<<<<<<< HEAD
      And Enter valid email address "mervemermer@gmail.com"

    Scenario: TC_03 Register fails if username is blank
      Then Leave username box blank
      And Enter valid email address "mervemermer@gmail.com"
      And Assert that username is not accepted

    Scenario Outline: TC_03 Register fails with invalid email address
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
=======
      And Assert that it accepts
      And Enter valid email address "mervemermer@gmail.com"
      And Assert that it accepts

    @US002_TC02
    Scenario: TC_01 Register with valid username and email address
      Then Enter valid username "mervemermer2023" with letters and numbers
      And Assert that it accepts
      And Enter valid email address "mervemermer@gmail.com"
      And Assert that it accepts

>>>>>>> master
