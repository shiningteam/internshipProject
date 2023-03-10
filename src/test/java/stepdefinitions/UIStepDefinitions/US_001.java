package stepdefinitions.UIStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.testng.Assert;
import pages.HomePage;
import pages.RegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_001 {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    Faker faker = new Faker();

    @Given("User goes to home page url")
    public void userGoesToHomePageUrl() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));

    }

    @When("Click Signin buttn at the top")
    public void clickSigninButtnAtTheTop() {
        homePage.userButton.click();
    }

    @Then("Click Registers button")
    public void clickRegistersButton() {
        homePage.homePageDropDownRegisterButton.click();
    }


    public void userConfirmsPasswords(String arg0) {
        registrationPage.passwordConfirm.sendKeys(arg0);
    }


    @Then("User enters SSN")
    public void userEntersSSN() {
        ReusableMethods.waitFor(2);

        int randomNumber3 = faker.number().numberBetween(100, 999);
        int randomNumber2 = faker.number().numberBetween(10, 99);
        registrationPage.ssnBox.sendKeys(randomNumber3 + "-" + randomNumber2 + "-" + randomNumber3);
        String elementText = registrationPage.ssnBox.getText();
        Assert.assertTrue(elementText.contains("-"));
    }

    @Then("user enters firstName")
    public void userEntersFirstName() {
        registrationPage.firstNameBox.sendKeys(faker.name().firstName());
    }

    @Then("user enters lastName")
    public void userEntersLastName() {
        registrationPage.lastNameBox.sendKeys(faker.name().lastName());
    }

    @Then("user enters username")
    public void userEntersUsername() {
        registrationPage.username.sendKeys(faker.name().username());
    }

    @Then("user enters email")
    public void userEntersEmail() {
        registrationPage.emailBox.sendKeys(faker.internet().emailAddress());
    }


    @Then("user enters {string}")
    public void userEnters(String arg0) {
    }

    @Then("user clicks registration button")
    public void userClicksRegistrationButton() {
    }


}
