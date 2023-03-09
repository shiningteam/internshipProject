package stepdefinitions.UIStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.HomePage;
import pages.RegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_001 {

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();

    @Given("Go to home page")
    public void goToHomePage() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));
    }


    @When("Click Register button")
    public void click_register_button() {
        homePage.homePageDropDownRegisterButton.click();
    }


    @Then("User enters {string}")
    public void ssn_bar(String string) {

        registrationPage.ssnBox.click();
        ReusableMethods.waitFor(2);
        Faker faker = new Faker();
        int randomNumber3 = faker.number().numberBetween(100, 999);
        int randomNumber2 = faker.number().numberBetween(10, 99);
        registrationPage.ssnBox.sendKeys(randomNumber3 + "-" + randomNumber2 + "-" + randomNumber3);
        String elementText = registrationPage.ssnBox.getText();
        Assert.assertTrue(elementText.contains("-"));

    }
    @Then("user enters {string}")
    public void firstNameBox(String string) {

        registrationPage.firstNameBox.click();
        Faker fakername = new Faker();
        registrationPage.firstNameBox.sendKeys(fakername.name().firstName());

    }
    @Then("user enters {string}")
    public void lastNameBox(String string) {

        registrationPage.lastNameBox.click();
        Faker fakerlname = new Faker();
        registrationPage.firstNameBox.sendKeys(fakerlname.name().lastName());

    }
    @Then("user enters {string}")
    public void username(String string) {

        registrationPage.userNameBox.click();
        Faker fakeruname = new Faker();
        registrationPage.userNameBox.sendKeys(fakeruname.name().username());

    }

    @Then("user enters {string}")
    public void email(String string) {

        registrationPage.emailBox.click();
        Faker fakeremail = new Faker();
        registrationPage.firstNameBox.sendKeys(fakeremail.internet().emailAddress());

    }

    @Then("user enters {string}")
    public void password(String string) {

        registrationPage.newPassword.click();
        Faker fakerp = new Faker();
        registrationPage.firstNameBox.sendKeys(fakerp.internet().password());
    }


    @Then("user confirms {string}")
    public void user_confirms(String string) {
        registrationPage.passwordConfirm.click();
        Faker fakerp= new Faker();
        registrationPage.passwordConfirm.sendKeys(fakerp.internet().password());

    }
    @Then("user clicks {string}")
    public void user_clicks(String string) {
        registrationPage.registerButton.click();
    }

    @Then("user asserts the registration is succesfull")
    public void user_asserts_the_registration_is_succesfull() {
      registrationPage.registrationSaved.isDisplayed();
    }




    }



