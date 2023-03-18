package stepdefinitions.UIStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AdminStaffPage;
import pages.HomePage;
import pages.SignInPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.JSUtils.clickElementByJS;

public class US_024 {
    HomePage homePage = new HomePage();
    SignInPage signInPage = new SignInPage();
    AdminStaffPage adminStaffPage = new AdminStaffPage();

    @Given("User goes to home page and Sign in with staff credentials")
    public void userGoesToHomePageAndSignInWithStaffCredentials() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));
        clickElementByJS(homePage.userButton);
        ReusableMethods.waitFor(3);
        clickElementByJS(homePage.loginButton);
        ReusableMethods.waitFor(2);
        signInPage.userNameBox.sendKeys(ConfigReader.getProperty("staff_username"));
        signInPage.passwordBox.sendKeys(ConfigReader.getProperty("staff_password"));
        clickElementByJS(signInPage.signInButton);
        ReusableMethods.waitFor(3);
    }

    @And("Navigate to {string}  page and searches patient with SSN")
    public void navigateToPageAndSearchesPatientWithSSN(String arg0) {
        clickElementByJS(adminStaffPage.myPagesDropdown);
        ReusableMethods.waitFor(2);
        clickElementByJS(adminStaffPage.searchPatientOption);
        ReusableMethods.waitFor(2);
        adminStaffPage.searchPatientWithSSN.sendKeys(ConfigReader.getProperty("patient_ssn"));
        ReusableMethods.waitFor(1);
    }

    @Then("View and  Verifies that the patient searched with SSN is displayed")
    public void view_and_verifies_that_the_patient_searched_with_ssn_is_displayed() {
        Assert.assertEquals("ShiningPatient", adminStaffPage.firstNameBox.getText());
        ReusableMethods.waitFor(5);
    }

    @Then("Verifies that patient's status is COMPLETED")
    public void verifies_that_patient_s_status_is_completed() {
       clickElementByJS(adminStaffPage.showAppointmentsIcon);
       ReusableMethods.waitFor(3);
        Assert.assertEquals( "COMPLETED", adminStaffPage.patientStatusBox.getText());
    }


    @Then("Verifies that all invoice is visible")
    public void verifiesThatAllInvoiceIsVisible() {
        clickElementByJS(adminStaffPage.paymentInvoiceIcon);
        Assert.assertTrue(adminStaffPage.paymentDetails.isDisplayed());
    }

    @Then("Verifies  that the invoice sent to the patient is visible")
    public void verifiesThatTheInvoiceSentToThePatientIsVisible() {
        clickElementByJS(adminStaffPage.showInvoiceIcon);
        Assert.assertEquals("INVOICE",adminStaffPage.sentInvoice.getText());

    }

}
