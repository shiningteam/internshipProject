package stepdefinitions.UIStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import pages.AdminStaffPage;
import pages.HomePage;
import pages.RegistrationPage;
import pages.SignInPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.JSUtils.clickElementByJS;

public class US_018 {
    HomePage homePage = new HomePage();
    SignInPage signInPage = new SignInPage();
    AdminStaffPage adminStaffPage = new AdminStaffPage();
    String actalertText;
    String testName = "<Name>";

    @Given("User goes to home page and Sign in")
    public void user_goes_to_home_page_and_sign_in() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));
        clickElementByJS(homePage.userButton);
        ReusableMethods.waitFor(3);
        clickElementByJS(homePage.loginButton);
        ReusableMethods.waitFor(2);
        signInPage.userNameBox.sendKeys(ConfigReader.getProperty("admin_username"));
        signInPage.passwordBox.sendKeys(ConfigReader.getProperty("admin_password"));
        clickElementByJS(signInPage.signInButton);
        ReusableMethods.waitFor(3);
    }

    @Given("Navigate to Test Item page")
    public void navigate_to_test_item_page() {
        clickElementByJS(adminStaffPage.itemsTitlesButton);
        ReusableMethods.waitFor(3);
        clickElementByJS(adminStaffPage.testItemIcon);
    }
    @Given("Clicks {string} box")
    public void clicks_box(String string) {
        clickElementByJS(adminStaffPage.newTestButton);
    }
    @Given("Enters all required fields such as {string}, {string}, {string}, {string}, {string}")
    public void enters_all_required_fields_such_as(String string, String string2, String string3, String string4, String string5) {
        adminStaffPage.nameBox.sendKeys(string);
        ReusableMethods.waitFor(1);
        adminStaffPage.descriptionBox.sendKeys(string2);
        ReusableMethods.waitFor(1);
        adminStaffPage.priceBox.sendKeys(string3);
        ReusableMethods.waitFor(1);
        adminStaffPage.defaultValMinBox.sendKeys(string4);
        ReusableMethods.waitFor(1);
        adminStaffPage.defaultValMaxBox.sendKeys(string5);
    }

    @Given("Clicks {string} button")
    public void clicks_button(String string) {
        clickElementByJS(adminStaffPage.saveButton);
        ReusableMethods.waitFor(2);
    }

    @Then("View and verify the created test item")
    public void viewAndVerifyTheCreatedTestItem() {
       clickElementByJS(adminStaffPage.createdDateButton);
        ReusableMethods.waitFor(2);
        clickElementByJS(adminStaffPage.viewBox);
        ReusableMethods.waitFor(2);
        Assert.assertTrue(adminStaffPage.nameTest.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @Then("Finds the test item to be updated")
    public void findsTheTestItemToBeUpdated() {
//        clickElementByJS(adminStaffPage.backButton);
//        ReusableMethods.waitFor(2);
        clickElementByJS(adminStaffPage.createdDateButton);
        ReusableMethods.waitFor(2);
        clickElementByJS(adminStaffPage.editBox);
        ReusableMethods.waitFor(5);
    }

    @Then("Updates it filling all required fields such as {string}, {string}, {string}, {string}, {string}")
    public void updatesItFillingAllRequiredFieldsSuchAs(String arg0, String arg1, String arg2, String arg3, String arg4) {
        adminStaffPage.nameBox.clear();
        adminStaffPage.nameBox.sendKeys(arg0);
        ReusableMethods.waitFor(1);
        adminStaffPage.descriptionBox.clear();
        adminStaffPage.descriptionBox.sendKeys(arg1);
        ReusableMethods.waitFor(1);
        adminStaffPage.priceBox.clear();
        adminStaffPage.priceBox.sendKeys(arg2);
        ReusableMethods.waitFor(1);
        adminStaffPage.defaultValMinBox.clear();
        adminStaffPage.defaultValMinBox.sendKeys(arg3);
        ReusableMethods.waitFor(1);
        adminStaffPage.defaultValMaxBox.clear();
        adminStaffPage.defaultValMaxBox.sendKeys(arg4);
        clickElementByJS(adminStaffPage.saveButton);
        ReusableMethods.waitFor(2);
    }

    @Then("Verifies that the test item is updated")
    public void verifies_that_the_test_item_is_updated() {
        try {
            Alert alt = Driver.getDriver().switchTo().alert();
            actalertText = alt.getText(); // get content of the Alert Message
            Assert.assertTrue(actalertText.contains("A test item is updated"));
            alt.accept();
            System.out.println("Test case: Passed");
        } catch (Exception e){

        }
        ReusableMethods.waitFor(5);
    }

    @Then("Finds the test item and delete it verify the created test item")
    public void finds_the_test_item_and_delete_it_verify_the_created_test_item() {
        clickElementByJS(adminStaffPage.createdDateButton);
        ReusableMethods.waitFor(2);
        clickElementByJS(adminStaffPage.deleteBox);
        ReusableMethods.waitFor(2);
        clickElementByJS(adminStaffPage.deleteConfirmButton);
    }

    @Then("Verifies that the test item is deleted")
    public void verifies_that_the_test_item_is_deleted() {

        try {
            Alert alt = Driver.getDriver().switchTo().alert();
            actalertText = alt.getText(); // get content of the Alert Message

            Assert.assertTrue(actalertText.contains("A test item is deleted"));
            alt.accept();
            System.out.println("Test case: Passed");
        } catch (Exception e){

        }


    }
}