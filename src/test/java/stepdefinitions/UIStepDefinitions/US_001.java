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
    public void ssn_bar() {
        registrationPage.ssnBox.click();
        ReusableMethods.waitFor(2);
        Faker faker = new Faker();
        int randomNumber3 = faker.number().numberBetween(100, 999);
        int randomNumber2 = faker.number().numberBetween(10, 99);
        registrationPage.ssnBox.sendKeys(randomNumber3 + "-" + randomNumber2 + "-" + randomNumber3);
        String elementText = registrationPage.ssnBox.getText();
        Assert.assertTrue(elementText.contains("-"));

    }

    @Then("User enters {string}")
    public void firstNameBox() {
        registrationPage.lastNameBox.click();
        Faker fakername = new Faker();
        registrationPage.firstNameBox.sendKeys(fakername.name().firstName());
    }

    @Then("User enters {string}")
    public void lastName() {
        registrationPage.lastNameBox.click();
        Faker fakerLastname = new Faker();
        registrationPage.lastNameBox.sendKeys(fakerLastname.name().lastName());
    }

    @Then("User enters {string}")
    public void userName() {
        registrationPage.userNameBox.click();
        Faker fakerUsername = new Faker();
        registrationPage.userNameBox.sendKeys(fakerUsername.name().username());
    }

    @Then("user enters {string}")
    public void email() {
        registrationPage.emailBox.click();
        Faker fakerEmail = new Faker();
        registrationPage.emailBox.sendKeys(fakerEmail.internet().emailAddress());
    }

    @Then("User enters {string}")
    public void userEntersSevenDigitWithAtLeastOneUppercaseOneLowercaseOneDigitAndOneSpecialChar(String arg0) {
        registrationPage.newPassword.sendKeys(arg0);
    }

    @Then("user confirms {string}")
    public void userConfirmsPasswords(String arg0) {
        registrationPage.passwordConfirm.sendKeys(arg0);
    }


    @Then(("user clicks {string}"))
    public void registrationButton(){
        registrationPage.registerButton.click();
    }



    }



