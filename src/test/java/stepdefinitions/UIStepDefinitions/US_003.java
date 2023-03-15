package stepdefinitions.UIStepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.HomePage;
import pages.RegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_003 {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();

    @Given("Go to home page")
    public void goToHomePage() {Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));
    }

    @When("Click Signin button at the top")
    public void click_signin_button_at_the_top() {
        homePage.userButton.click();

    }

    @Then("Click Register button")
    public void click_register_button() {
        homePage.homePageDropDownRegisterButton.click();

    }

    @Then("User enters four digit {string}")
    public void userEntersFourDigit(String arg0) {

        registrationPage.newPassword.sendKeys(arg0);
    }

    @Then("Assert that Password strength line is in the first line")
    public void assertThatPasswordStrengthLineIsInTheFirstLine() {
        Assert.assertTrue(registrationPage.strengthBar1.isDisplayed());
    }

    @Then("User enters seven digit {string} with at least one uppercase")
    public void userEntersSevenDigitWithAtLeastOneUppercase(String arg0) {

        registrationPage.newPassword.sendKeys(arg0);
    }

    @Then("Assert that Password strength line is in the second line")
    public void assert_that_password_strength_line_is_in_the_second_line() {
        Assert.assertTrue(registrationPage.strengthBar2.isDisplayed());

    }




    @Then("User enters seven digit {string} with at least one uppercase, one lowercase, one digit")
    public void userEntersSevenDigitWithAtLeastOneUppercaseOneLowercaseOneDigit(String arg0) {
        registrationPage.newPassword.sendKeys(arg0);
    }

    @Then("Assert that Password strength line is in the forth line")
    public void assertThatPasswordStrengthLineIsInTheForthLine() {
        Assert.assertTrue(registrationPage.strengthBar4.isDisplayed());
    }

    @Then("User enters seven digit {string} with at least one uppercase, one lowercase, one digit and one special char")
    public void userEntersSevenDigitWithAtLeastOneUppercaseOneLowercaseOneDigitAndOneSpecialChar(String arg0) {
        registrationPage.newPassword.sendKeys(arg0);

    }

    @Then("Assert that Password strength line is in the fifth line")
    public void assertThatPasswordStrengthLineIsInTheFifthLine() {
        Assert.assertTrue(registrationPage.strengthBar5.isDisplayed());
    }
}
