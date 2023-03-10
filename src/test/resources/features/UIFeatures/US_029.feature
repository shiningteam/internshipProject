@US029_UI_Test
Feature: Create Country

  Background:
    Given User goes to home page

  @login_scenario
  Scenario Outline: login_scenario
    And User tries to login entering "<username>" and "<password>"
    Then Assert that login successful

    Examples:test_data
      |  username        |   password      |
      | AdminTeam01      |   Team01+       |

    @TC01_CreateCountry
    Scenario Outline: TC01_CreateCountry

      And Click on Items&Titles icon
      And Select the Country from dropdown
      Then Verify the country page is displayed
      And Click on Create a new country button
      And Enter the "<countryName>"
      And Click on Save button
      Then Verify the new country is created

      Examples:
        | countryName |
        | Italy       |

    @TC02_CreateCountry
    Scenario Outline: TC02_CreateStateCity

      And Click on Items&Titles icon
      And Select the State/City from dropdown
      Then Verify the State/City page is displayed
      And Click on Create a new State/City button
      And Enter the "<cityName>"
      And Select the "<countryName>" from dropdown
      And Click on Save button
      Then Verify the new city is created

      Examples:
        | cityName | countryName
        | Rome     | Italy

