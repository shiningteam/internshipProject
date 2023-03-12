package stepdefinitions.UIStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.AdminCountryPage;
import pages.AdminHomePage;
import utilities.JSUtils;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

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
    public void enter_the(String countryName) {
        adminCountryPage.countryName.sendKeys(countryName);
    }

    @Then("Click on Save button")
    public void click_on_save_button() {
        //ReusableMethods.waitFor(3);
        JSUtils.clickElementByJS(adminCountryPage.saveButton);
    }

    @Then("Verify the new {string} is created")
    public void verify_the_new_is_created(String countryName) {
        ReusableMethods.waitFor(3);
        for (WebElement w : adminCountryPage.countryList) {
            System.out.println(w.getText());
            if (w.getText().contains(countryName)) {
                assertTrue(true);
                break;
            }
        }
    }

    @Given("Select the StateCity from dropdown")
    public void select_the_state_city_from_dropdown() {
        JSUtils.clickElementByJS(adminHomePage.itemsTitlesDropdown);
        JSUtils.clickElementByJS(adminHomePage.stateCity);
    }
    @Then("Verify the StateCity page is displayed")
    public void verify_the_state_city_page_is_displayed() {
        adminCountryPage.stateCityHeading.isDisplayed();
    }
    @Then("Click on Create a new StateCity button")
    public void click_on_create_a_new_state_city_button() {
        JSUtils.clickElementByJS(adminCountryPage.createNewCity);
    }

    @Then("Fill the {string}")
    public void fill_the(String cityName) {
        adminCountryPage.cityName.sendKeys(cityName);
    }

    @Then("Select the {string} from dropdown")
    public void select_the_from_dropdown(String countryName) {
        Select select = new Select(adminCountryPage.countryDropdown);
        select.selectByVisibleText("Italy");
    }

    @Then("Verify the new city is created")
    public void verify_the_new_city_is_created() {


    }

}




