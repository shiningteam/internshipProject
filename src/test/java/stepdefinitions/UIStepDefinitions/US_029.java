package stepdefinitions.UIStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.AdminHomePage;
import utilities.DBUtils;
import utilities.JSUtils;

public class US_029 {

    AdminHomePage adminHomePage = new AdminHomePage();

    @Given("Click on Items&Titles icon")
    public void click_on_items_titles_icon() {
        adminHomePage.itemsTitlesIcon.click();
    }
    @Given("Select the Country from dropdown")
    public void select_the_country_from_dropdown() {
        Select select = new Select(adminHomePage.itemsTitlesDropdown);
        select.selectByVisibleText("Country");

    }
    @Then("Verify the country page is displayed")
    public void verify_the_country_page_is_displayed() {

    }
    @Then("Click on Create a new country button")
    public void click_on_create_a_new_country_button() {

    }
    @Then("Enter the {string}")
    public void enter_the(String string) {

    }
    @Then("Click on Save button")
    public void click_on_save_button() {

    }
    @Then("Verify the new country is created")
    public void verify_the_new_country_is_created() {

    }


}
