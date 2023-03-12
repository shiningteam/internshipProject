@US029_UI_Test
Feature: Create Country

  Background: Sign In Medunna as an Admin
    Given User goes to home page
    And User tries to login entering "AdminTeam01" and "Team01+"

      @TC01_CreateCountry
      Scenario Outline: TC01_CreateCountry

        And Click on Items&Titles icon
        And Select the Country from dropdown
        Then Verify the country page is displayed
        And Click on Create a new country button
        And Enter the "<countryName>"
        And Click on Save button
        Then Verify the new "<countryName>" is created

        Examples:
          | countryName |
          | Italy       |


      @TC02_CreateCity
      Scenario Outline: TC02_CreateStateCity

        And Click on Items&Titles icon
        And Select the StateCity from dropdown
        Then Verify the StateCity page is displayed
        And Click on Create a new StateCity button
        And Fill the "<cityName>"
        And Select the "<countryName>" from dropdown
        And Click on Save button
        Then Verify the new city is created

        Examples:
          | cityName | countryName
          | Rome     | Italy