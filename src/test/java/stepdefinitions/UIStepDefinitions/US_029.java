package stepdefinitions.UIStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AdminCountryPage;
import pages.AdminHomePage;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class US_029 {

    AdminHomePage adminHomePage = new AdminHomePage();
    AdminCountryPage adminCountryPage = new AdminCountryPage();
    @Given("Click on Items&Titles icon")
    public void click_on_items_titles_icon() {
        adminHomePage.itemsTitlesIcon.click();
        ReusableMethods.waitFor(3);
    }
    @Given("Select the Country from dropdown")
    public void select_the_country_from_dropdown() {
        JSUtils.clickElementByJS(adminHomePage.itemsTitlesDropdown);
        JSUtils.clickElementByJS(adminHomePage.country);

    }
    @Then("Verify the country page is displayed")
    public void verify_the_country_page_is_displayed() {
        adminCountryPage.countryHeading.isDisplayed();
    }
    @Then("Click on Create a new country button")
    public void click_on_create_a_new_country_button() {
        JSUtils.clickElementByJS(adminCountryPage.createNewCountry);
    }
    @Then("Enter the {string}")
    public void enter_the(String string) {
        adminCountryPage.countryName.sendKeys("Italy");
    }
    @Then("Click on Save button")
    public void click_on_save_button() {
        adminCountryPage.saveButton.submit();
    }
    @Then("Verify the new country is created")
    public void verify_the_new_country_is_created() {

    }
}
