@US002_Merve
  Feature: Username and email address


    Background:
      Given User goes to homepage
      When Click "register" button

    @US002_TC01
    Scenario: TC_01 Register with valid username and email address
    Then Enter valid username "mervemermer2023" with letters and numbers
    And Assert that it accepts
    And Enter valid email address "mervemermer@gmail.com"
    And Assert that it accepts