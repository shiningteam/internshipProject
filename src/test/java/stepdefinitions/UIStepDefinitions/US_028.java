package stepdefinitions.UIStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.AdminHomePage;
import pages.AdminMessages;
import pages.HomePage;
import pages.SignInPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.JSUtils.*;

public class US_028 {
    HomePage homePage = new HomePage();
    SignInPage signInPage=new SignInPage();
    AdminHomePage adminHomePage = new AdminHomePage();
    AdminMessages adminMessages = new AdminMessages();
    Faker faker=new Faker();

    @Given("go to home page")
    public void goToHomePage() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));
    }

    @And("Verify that admin is in home page")
    public void verifyThatAdminIsInHomePage() {
        String currentUrl=Driver.getDriver().getCurrentUrl();
        System.out.println("title = " + currentUrl);
        Assert.assertEquals("https://www.medunna.com/",currentUrl);

    }
    @Given("sign in as admin")
    public void sign_in_as_admin() {
        ReusableMethods.waitFor(2);
        clickElementByJS(homePage.userButton);
        ReusableMethods.waitFor(2);
        clickElementByJS(homePage.homePageSignInButton);
        ReusableMethods.waitFor(2);
        signInPage.userNameBox.sendKeys(ConfigReader.getProperty("admin_username"));
        ReusableMethods.waitFor(2);
        signInPage.passwordBox.sendKeys(ConfigReader.getProperty("admin_password"));
        ReusableMethods.waitFor(2);
        clickElementByJS(signInPage.signinButton);

    }
    @Given("Verify that admin is logged in")
    public void verify_that_admin_is_logged_in() {
        Assert.assertTrue(adminHomePage.adminNameButton.isDisplayed());
    }
    @When("Click on Items&Titles button")
    public void click_on_items_titles_button() {
        ReusableMethods.waitFor(2);
        clickElementByJS(adminHomePage.adminItemsTitlesButton);
    }
    @And("Click on Messages option")
    public void clickOnMessagesOption() {
        ReusableMethods.waitFor(2);
        clickElementByJS(adminHomePage.adminMessagesOption);

    }
    @Then("The messages ,their authors and emails should be displayed")
    public void the_messages_their_authors_and_emails_should_be_displayed() {
        String tableText=adminMessages.messagesTable.getText();

        Assert.assertTrue(tableText.contains("message"));

    }


    

    @And("Click  on Create a new Message button")
    public void clickOnCreateANewMessageButton() {
        ReusableMethods.waitFor(2);
        clickElementByJS(adminMessages.createNewMessageButton);
    }

    @And("Fill in the blanks with required information")
    public void fillInTheBlanksWithRequiredInformation() {
        ReusableMethods.waitFor(2);
        String name=faker.name().firstName();
        String email=faker.internet().emailAddress();
        adminMessages.nameForMessage.sendKeys(name);
        ReusableMethods.waitFor(2);
        adminMessages.emailForMessage.sendKeys(email);
        ReusableMethods.waitFor(2);
        adminMessages.subjectForMessage.sendKeys("test result");
        ReusableMethods.waitFor(2);
        adminMessages.messageForMessage.sendKeys("Can you send email the test results");

    }

    @And("Click on Save button")
    public void clickOnSaveButton() {
        ReusableMethods.waitFor(2);
        clickElementByJS(adminMessages.saveButton);
        
    }

    @Then("Verify that success message")
    public void verifyThatSuccessMessage() {
        ReusableMethods.waitFor(2);
        String saveSuccessMessage=adminMessages.saveSuccessMessage.getText();
        Assert.assertTrue(saveSuccessMessage.contains("is created"));

    }


    @And("Click  on Edit button of  created message")
    public void clickOnEditButtonOfCreatedMessage() {
        ReusableMethods.waitFor(2);
        scrollIntoViewJS(adminMessages.createdIdNumber);
        ReusableMethods.waitFor(2);
        clickElementByJS(adminMessages.editButton);
    }

    @And("Change  the message")
    public void changeTheMessage() {
        adminMessages.messageForMessage.sendKeys("yeni");

    }

    @Then("Verify that updated success message")
    public void verifyThatUpdatedSuccessMessage() {
        ReusableMethods.waitFor(2);
        String updateSuccessMessage=adminMessages.saveSuccessMessage.getText();
        Assert.assertTrue(updateSuccessMessage.contains("is updated"));


    }

    @And("Click  on Delete button of  created message")
    public void clickOnDeleteButtonOfCreatedMessage() {
        ReusableMethods.waitFor(2);
        scrollIntoViewJS(adminMessages.createdIdNumber);
        ReusableMethods.waitFor(2);
        clickElementByJS(adminMessages.deleteButton);

    }

    @And("Confirm delete operation and click on {string} button")
    public void confirmDeleteOperationAndClickOnButton(String arg0) {
        clickElementByJS(adminMessages.confirmDeleteMessage);

    }

    @Then("Verify that deleted success message")
    public void verifyThatDeletedSuccessMessage() {
        ReusableMethods.waitFor(2);
        String deleteSuccessMessage=adminMessages.saveSuccessMessage.getText();
        Assert.assertTrue(deleteSuccessMessage.contains("is updated"));

    }


}



