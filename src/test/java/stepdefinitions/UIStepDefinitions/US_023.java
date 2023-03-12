package stepdefinitions.UIStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_023 {
    HomePage homePage = new HomePage();
    SignInPage signInPage=new SignInPage();
    StaffMyPagesPage myPagesPage=new StaffMyPagesPage();
    SearchPatientPage searchPatientPage = new SearchPatientPage();
    @Given("User goes to home page url")
    public void user_goes_to_home_page_url() {
            Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));
        ReusableMethods.waitFor(2);
    }
    @When("Click Signin buttn at the top")
    public void click_signin_buttn_at_the_top() {
        homePage.userButton.click();
        ReusableMethods.waitFor(2);
    }
    @Then("Click Signin")
    public void click_signin() {
        homePage.homePageDropDownRegisterButton.click();
        ReusableMethods.waitFor(2);
    }
    @When("user enters {string}")
    public void user_enters() {
        signInPage.usernameInput.sendKeys();
        ReusableMethods.waitFor(2);
    }
    @Then("user enters {string}")
    public void user_enters(String string) {
        signInPage.passwordInput.sendKeys();
        ReusableMethods.waitFor(2);

    }
    @Then("user clicks sign in")
    public void user_clicks_sign_in() {
       signInPage.signinButton.click();
       ReusableMethods.waitFor(2);
    }
    @Then("User clicks my pages")
    public void user_clicks_my_pages() {
        myPagesPage.MyPagesDropdown.click();
        ReusableMethods.waitFor(2);
    }
    @Then("User clicks search patient bar")
    public void user_clicks_search_patient_bar() {
        myPagesPage.SearchPatient.click();
        ReusableMethods.waitFor(2);
    }
    @Then("User enters a valid ssn number into search box")
    public void user_enters_a_valid_ssn_number_into_search_box() {
       searchPatientPage.ssnBar.sendKeys("777-77-777");
        ReusableMethods.waitFor(2);
    }
    @Then("User clicks show appointments")
    public void user_clicks_show_appointments() {
        searchPatientPage.showAppointmentButton.click();
        ReusableMethods.waitFor(2);
    }
    @Then("user clicks show tests")
    public void user_clicks_show_tests() {
         searchPatientPage.showTestsButton.click();
        ReusableMethods.waitFor(2);
    }
    @Then("user clicks view the results")
    public void user_clicks_view_the_results() {
       searchPatientPage.viewResultButton.click();
        ReusableMethods.waitFor(2);
    }
    @Then("user clicks edit button")
    public void user_clicks_edit_button() {
        searchPatientPage.editTestButton.click();
        ReusableMethods.waitFor(2);
    }
    @Then("user sends value to result bar")
    public void user_sends_value_to_result_bar() {
        searchPatientPage.resultBar.sendKeys("93");
        ReusableMethods.waitFor(2);

    }
    @Then("user clicks save button")
    public void user_clicks_save_button() {
       searchPatientPage.saveButton.click();
        ReusableMethods.waitFor(2);
    }
//    @Then("user verifies is the result editable")
//    public void user_verifies_is_the_result_editable() {
//        try {
//           Allert allert = new Allert
//            Allert alt = Driver.getDriver().switchTo().alert();
//            actalertTex = altgetText();
//            Assert.assertTrue(actalertText.contains("A Test Result is updated with identifier"));
//            alt.accept();
//            System.out.println("Test passed");
//        }catch (Exception e){
//
       }



