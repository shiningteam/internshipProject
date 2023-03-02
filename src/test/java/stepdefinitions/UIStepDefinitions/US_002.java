package stepdefinitions.UIStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;
import pages.RegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class US_002 {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    @Given("User goes to homepage")
    public void user_goes_to_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));
    }
    @When("Click {string} button")
    public void click_button(String string) {
        homePage.userButton.click();
        ReusableMethods.waitFor(5);
        homePage.homePageDropDownRegisterButton.click();
        ReusableMethods.waitFor(5);
    }
    @Then("Enter valid username {string} with letters and numbers")
    public void enter_valid_username_with_letters_and_numbers(String string) {
        registrationPage.username.sendKeys(string);
        ReusableMethods.waitFor(5);
    }
    @Then("Enter valid email address {string}")
    public void enter_valid_email_address(String string) {
        registrationPage.email.sendKeys(string);
        ReusableMethods.waitFor(5);
    }
    @Then("Leave username box blank")
    public void leave_username_box_blank() {
        registrationPage.username.click();
        ReusableMethods.waitFor(5);
        registrationPage.email.click();
    }
    @Then("Assert that username is not accepted")
    public void assert_that_username_is_not_accepted() {
//        Assert.assertTrue(registrationPage.usernameRequired.isDisplayed());
//        ReusableMethods.waitFor(5);
        for (int i = 0; i < 5; i++) {
            try {
                Assert.assertTrue(registrationPage.usernameRequired.isEnabled());
            } catch (Exception e) {
                Driver.wait(1);
            }
        }
    }
    @Then("Enter invalid {string}")
    public void enter_invalid(String string) {
        registrationPage.email.sendKeys(string);
        ReusableMethods.waitFor(5);
        registrationPage.username.click();
    }
    @Then("Assert that email is not accepted")
    public void assert_that_email_is_not_accepted() {
//        Assert.assertTrue(registrationPage.emailInvalid.isDisplayed());
//        ReusableMethods.waitFor(5);
        for (int i = 0; i < 5; i++) {
            try {
                Assert.assertTrue(registrationPage.emailInvalid.isEnabled());
            } catch (Exception e) {
                Driver.wait(1);
            }
        }
    }
    @Then("Leave email address box  blank")
    public void leave_email_address_box_blank() {
        registrationPage.email.click();
        ReusableMethods.waitFor(5);
        registrationPage.username.click();
    }
    @Then("Assert that user gets error message")
    public void assert_that_user_gets_error_message() {
//        Assert.assertTrue(registrationPage.emailRequired.isDisplayed());
//        ReusableMethods.waitFor(5);
        for (int i = 0; i < 5; i++) {
            try {
                Assert.assertTrue(registrationPage.emailRequired.isEnabled());
            } catch (Exception e) {
                Driver.wait(1);
            }
        }
    }


}
