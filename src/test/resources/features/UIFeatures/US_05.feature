@Login
Feature: Login_feature

  Background:
   Given User goes to home page
  @login_scenario
  Scenario Outline: login_scenario
    And User tries to login entering "<username>" and "<password>"
    Then Assert that login successful

    Examples:test_data
      |  username        |   password      |
      | AdminTeam01      |   Team01+       |
      | ShiningPhysician |Shiningphysician1|
      | shiningtakım     |  shteam123      |
      | shiningteamm     |  shteam111      |
      | shiningtakım     |  shteam111      |

  Scenario Outline: login_cancel_scenario
    And User tries to login entering "<username>" and "<password>"
    And cliks cancel button
    Then Assert that cancel successful

    Examples:test_data
      |  username        |   password      |
      | AdminTeam01      |   shteam123     |
      | shiningtakım     |  shteam111      |

  Scenario Outline: navigating_registeration_page_scenario
    And User tries to login entering "<username>" and "<password>"
    And Assert that login successful
    And User navigates registration page
    Then Assert that navigation to registration page successful
    Then close application

    Examples:test_data
      |  username        |   password       |
      | shiningtakım     |  shteam111       |
      | shininghasta    |  shteam103        |
