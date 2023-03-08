package stepdefinitions.UIStepDefinitions;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.PhysicianMyAppointmentPage;
import pages.SignInPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import java.io.IOException;


public class US_012 {
    HomePage homePage=new HomePage();
    SignInPage signInPage=new SignInPage();
    PhysicianMyAppointmentPage physicianMyAppointmentPage=new PhysicianMyAppointmentPage();

    @Given("Go to home page and sign in")
    public void go_to_home_page_and_sign_in() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));
        homePage.userButton.click();
        homePage.loginButton.click();
        ReusableMethods.waitFor(2);
        signInPage.usernameInput.sendKeys(ConfigReader.getProperty("physician_username"));
        signInPage.passwordInput.sendKeys(ConfigReader.getProperty("physician_password"));
        signInPage.signInButton.click();
        ReusableMethods.waitFor(2);
    }
    @Given("User clicks on MY PAGES dropdown and select My Appointments option")
    public void user_clicks_on_my_pages_dropdown_and_select_my_appointments_option() {
        physicianMyAppointmentPage.myPagesDropdown.click();
        physicianMyAppointmentPage.myAppointmentsOption.click();
        ReusableMethods.waitFor(2);
    }
    @Given("Click on edit button")
    public void click_on_edit_button() {
        physicianMyAppointmentPage.editButton.click();
    }
    @Given("Verify user see patiet's id such as {string},{string},{string},{string},{string}")
    public void verify_user_see_patiet_s_id_such_as(String string, String string2, String string3, String string4, String string5) throws IOException {
        Assert.assertTrue(physicianMyAppointmentPage.idInput.isDisplayed());
        ReusableMethods.getScreenshot("Patient's id, startdate, enddate");
        JSUtils.scrollDownByJS();
        ReusableMethods.getScreenshot("Patient's status");
        JSUtils.scrollDownByJS();
        JSUtils.scrollDownByJS();
        JSUtils.scrollDownByJS();
        ReusableMethods.getScreenshot("Patient's physician");

    }
    @Given("User types in required fields")
    public void user_types_in_required_fields() {
        Select select=new Select(physicianMyAppointmentPage.statusInput);
        select.selectByVisibleText("COMPLETED");
        ReusableMethods.waitFor(2);
        physicianMyAppointmentPage.anamnesisInput.clear();
        physicianMyAppointmentPage.anamnesisInput.sendKeys("Itching occurred 2 years ago");
        ReusableMethods.waitFor(1);
        physicianMyAppointmentPage.treatmentInput.clear();
        physicianMyAppointmentPage.treatmentInput.sendKeys("Should stay away from the sun and use the ointment provided.");
        ReusableMethods.waitFor(1);
        physicianMyAppointmentPage.diagnosisInput.clear();
        physicianMyAppointmentPage.diagnosisInput.sendKeys("Eczema");
        ReusableMethods.waitFor(2);
    }
    @Then("Verify the required fields can be typed")
    public void verify_the_required_fields_can_be_typed() throws IOException {
        JSUtils.clickElementByJS(physicianMyAppointmentPage.saveButton);
        ReusableMethods.waitFor(2);
        ReusableMethods.getScreenshot("Save is done succesfully");

    }
    @Then("close the application")
    public void close_the_application() {
        Driver.closeDriver();
    }

    //US012_TC002

    @When("Only numbers are to be entered in the description field.")
    public void only_numbers_are_to_be_entered_in_the_description_field() {
        ReusableMethods.waitFor(2);
        physicianMyAppointmentPage.descriptionInput.clear();
        physicianMyAppointmentPage.descriptionInput.sendKeys("123456789");
        ReusableMethods.waitFor(3);
    }
    @Then("Verify the edit is done succesfully")
    public void verify_the_edit_is_done_succesfully() throws IOException {
        JSUtils.clickElementByJS(physicianMyAppointmentPage.saveButton);
        ReusableMethods.waitFor(2);
        ReusableMethods.getScreenshot("Save is done succesfully");
    }
    @Then("Verify there is no error if only numbers are to be entered in the description field.")
    public void verify_there_is_no_error_if_only_numbers_are_to_be_entered_in_the_description_field() {
        physicianMyAppointmentPage.editButton.click();
        Assert.assertTrue(physicianMyAppointmentPage.descriptionInput.getText().contains("123456789"));
    }
    @Then("Close the application")
    public void close_the_application2() {
        Driver.closeDriver();
    }

}