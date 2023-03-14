package stepdefinitions.UIStepDefinitions;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.AdminHomePage;
import pages.HomePage;
import pages.SignInPage;
import pages.StaffMyPagesPage;
import utilities.Driver;

public class US_019 {
    HomePage homePage = new HomePage();
    SignInPage signInPage = new SignInPage();
    AdminHomePage adminHomePage = new AdminHomePage();
    StaffMyPagesPage staffMyPagesPage = new StaffMyPagesPage();


    @When("Admin clicks user button at the top")
    public void admin_clicks_user_button_at_the_top() {
        homePage.userButton.click();

    }

    @When("Admin clicks signin button")
    public void admin_clicks_signin_button() {
        homePage.SignInButton.click();


    }

    @When("Admin fills the user name part {string} and password part {string} click sinin button")
    public void admin_fills_the_user_name_part_and_password_part_click_sinin_button(String string, String string2) {
        signInPage.userNameBox.sendKeys(string);
        signInPage.passwordBox.sendKeys(string2);
        signInPage.signInButton.click();

    }

    @When("Admin click Items&Titles and click Staff button")
    public void admin_click_items_titles_and_click_staff_button() {
        adminHomePage.itemsTitlesIcon.click();
        adminHomePage.staffButton.click();

    }

    @When("Clicks Create a Staff button")
    public void clicks_create_a_staff_button() {
        staffMyPagesPage.createANewStaffButton.click();

    }

    @When("Clicks Use Snn radio button")
    public void clicks_use_snn_radio_button() {
        staffMyPagesPage.SsnSearchRadioButton.click();

    }

    @And("writes a registered {string} to confirm")
    public void writesARegisteredToConfirm(String arg0) {
        staffMyPagesPage.SsnBox.sendKeys(arg0);
        staffMyPagesPage.searchUserButton.click();

    }

    @Then("Assert that User found with search SSN is displayed")
    public void assert_that_user_found_with_search_ssn_is_displayed() {
        Driver.wait(1);
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("User found with search SSN"));

    }
}
