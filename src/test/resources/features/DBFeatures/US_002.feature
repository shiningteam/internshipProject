@US002_DB_Test
Feature: Username and Email Address Validation

  Scenario Outline: Validate user by Username and Email Address

    Given user connects to database
    When get all "<column>" as a list from "<table>"
    Then verify contains "<data>"
    And close the connection

    Examples:
      | column        | table        | data                  |
      | login         | jhi_user     | mervemermer           |
      | email address | jhi_user     | mervemermer@gmail.com |
