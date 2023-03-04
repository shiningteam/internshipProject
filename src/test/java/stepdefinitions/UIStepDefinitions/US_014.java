package stepdefinitions.UIStepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.PhysicianMyAppointmentPage;
import pages.PhysicianTestItems;
import pages.SignInPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class US_014 {
    HomePage homePage=new HomePage();
    SignInPage signInPage=new SignInPage();
    PhysicianMyAppointmentPage physicianMyAppointmentPage=new PhysicianMyAppointmentPage();
    PhysicianTestItems physicianTestItems=new PhysicianTestItems();

    @When("Navigate to home page and sign in")
    public void navigate_to_home_page_and_sign_in() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("medunna"));
        homePage.userButton.click();
        Driver.waitAndClick(homePage.loginButton);
        Driver.waitAndSendText(signInPage.usernameInput, ConfigReader.getProperty("physician_username"));
        Driver.waitAndSendText(signInPage.passwordInput, ConfigReader.getProperty("physician_password"));
        Driver.waitAndClick(signInPage.signInButton);
    }
    @When("Clicks on MY PAGES dropdown and select My Appointments option")
    public void clicks_on_my_pages_dropdown_and_select_my_appointments_option() {
        Driver.waitAndClick(physicianMyAppointmentPage.myPagesDropdown);
        ReusableMethods.waitFor(1);
        Driver.waitAndClick(physicianMyAppointmentPage.myAppointmentsOption);
    }
    @When("Clicks on edit button")
    public void clicks_on_edit_button() {
        Driver.waitAndClick(physicianMyAppointmentPage.editButton);
        ReusableMethods.waitFor(2);
    }
    @When("Physician clicks on request a test")
    public void physician_clicks_on_request_a_test() {
        Driver.waitAndClick(physicianMyAppointmentPage.requestTestButton);
        ReusableMethods.waitFor(2);
    }
    @When("Select required {string}")
    public void select_required(String string) {
        List<WebElement> tests=new ArrayList<>();
        List<WebElement> requiredTests=new ArrayList<>();

        for (WebElement w: physicianTestItems.tests){
            tests.add(w);
            if (tests.indexOf(w)>2 && tests.indexOf(w)<11){
                requiredTests.add(w);
            }
        }
        for (WebElement t: requiredTests){
            Driver.waitAndClick(t);
        }
        ReusableMethods.waitFor(2);
        Driver.waitAndClick(physicianTestItems.saveButton);
        ReusableMethods.waitFor(2);
    }
    @When("Click on Show Test Results button")
    public void click_on_show_test_results_button() {
        JSUtils.clickElementByJS(physicianMyAppointmentPage.showTestResults);
        ReusableMethods.waitFor(2);
        Driver.waitAndClick(physicianTestItems.viewResultsButton);
        ReusableMethods.waitFor(2);
    }
    @Then("Verify see all {string} information and {string}")
    public void verify_see_all_information_and(String string, String string2) {
        List<WebElement> testsNames = new ArrayList<>();
        List<WebElement> testsInfo = new ArrayList<>();
        for (WebElement w : physicianTestItems.testInfo) {
            if (w.getText().contains("Glucose") || w.getText().contains("Urea")||
            w.getText().contains("Creatinine")|| w.getText().contains("Sodium") ||
            w.getText().contains("Potassium") ||w.getText().contains("Total Protein")||
            w.getText().contains("Albumin")|| w.getText().contains("Hemoglobin")){
                testsNames.add(w);
            }else {
                testsInfo.add(w);
            }

        }
        System.out.println("Requested tests: ") ;
       for (WebElement w: testsNames){
           System.out.println(w.getText());
       }
        System.out.println("Requested tests info: ");
       for (WebElement t: testsInfo){
           System.out.println(t.getText() );
       }

    }



    //US_014_TC_002

    @When("User clicks on Request Inpatient button")
    public void user_clicks_on_request_inpatient_button() {
       Driver.waitAndClick(physicianMyAppointmentPage.requestTestButton);
       ReusableMethods.waitFor(2);
    }
    @When("Click on MY PAGES dropdown and select My Inpatients option")
    public void click_on_my_pages_dropdown_and_select_my_inpatients_option() {
        Driver.waitAndClick(physicianMyAppointmentPage.myPagesDropdown);
        ReusableMethods.waitFor(1);
        Driver.waitAndClick(physicianMyAppointmentPage.myInpatientsButton);
    }
    @Then("Verify the requested patient is on the {string} list")
    public void verify_the_requested_patient_is_on_the_list(String string) {
        Assert.assertTrue(physicianMyAppointmentPage.patientSsn.getText().contains(string));
    }


}
