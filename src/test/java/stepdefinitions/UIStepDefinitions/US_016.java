package stepdefinitions.UIStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.AdminHomePage;
import pages.AdminPatientsPage;
import pages.HomePage;
import pages.SignInPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class US_016 {
    HomePage homePage=new HomePage();
    SignInPage signInPage=new SignInPage();
    AdminHomePage adminHomePage=new AdminHomePage();
    AdminPatientsPage adminPatientsPage=new AdminPatientsPage();
    Faker faker=new Faker();
    String email=faker.internet().emailAddress();
    @Given("user \\(Admin) goes to home page")
    public void user_admin_goes_to_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));
        homePage.userButton.click();
        homePage.loginButton.click();
        ReusableMethods.waitFor(2);
        signInPage.usernameInput.sendKeys(ConfigReader.getProperty("admin_username"));
        signInPage.passwordInput.sendKeys(ConfigReader.getProperty("admin_password"));
        signInPage.signInButton.click();
        ReusableMethods.waitFor(2);
    }
    @When("Click Patients link")
    public void click_patients_link() {
        Driver.waitAndClick(adminHomePage.patientsLink);
    }
    @When("Click Create a new Patient button")
    public void click_create_a_new_patient_button() {
        Driver.waitAndClick(adminPatientsPage.createNewPatientButton);
    }
    @Then("Verify see all patient information")
    public void verify_see_all_patient_information() {
        List<String> requiredFieldsNames = new ArrayList<>();
        List< String> expectedRequiredFieldsNames = new ArrayList<>();
        expectedRequiredFieldsNames.add("First Name");
        expectedRequiredFieldsNames.add("Last Name");
        expectedRequiredFieldsNames.add("Birth Date");
        expectedRequiredFieldsNames.add("Email");
        expectedRequiredFieldsNames.add("Phone");
        expectedRequiredFieldsNames.add("Gender");
        expectedRequiredFieldsNames.add("Blood Group");
        expectedRequiredFieldsNames.add("Address");
        expectedRequiredFieldsNames.add("Description");
        expectedRequiredFieldsNames.add("User");
        expectedRequiredFieldsNames.add("Country");
        expectedRequiredFieldsNames.add("State/City");

        for (WebElement t : adminPatientsPage.patientInformationsInput) {
            requiredFieldsNames.add(t.getText());
        }

        System.out.println(requiredFieldsNames);
        Collections.sort(requiredFieldsNames);
        Collections.sort(expectedRequiredFieldsNames);
        Assert.assertEquals(expectedRequiredFieldsNames, requiredFieldsNames);
    }

    @Then("Enter the required fields")
    public void enter_the_required_fields() {
        for (WebElement w: adminPatientsPage.patientInformation1){
            switch (adminPatientsPage.patientInformation1.indexOf(w)){
                case 0:
                    Driver.waitAndSendText(w, "John");
                    break;
                case 1:
                    Driver.waitAndSendText(w, "Yılmaz");
                    break;
                case 2:
                    Driver.waitAndSendText(w, "11.02.1999");
                    break;
                case 3:

                    Driver.waitAndSendText(w, email);
                    break;
                case 4:
                    Driver.waitAndSendText(w, faker.phoneNumber().cellPhone());
            }
        }

        for (WebElement t: adminPatientsPage.patientInformation2){
            switch (adminPatientsPage.patientInformation2.indexOf(t)){
                case 0:
                    Select select=new Select(t);
                    Driver.wait(2);
                    select.selectByVisibleText("FEMALE");
                    break;
                case 1:
                    Select select1=new Select(t);
                    Driver.wait(3);
                    select1.selectByVisibleText("B+");
                    break;
                case 2:
                    Select select2=new Select(t);
                    Driver.wait(4);
                    select2.selectByVisibleText("system");
                case 3:
                    Select select3=new Select(t);
                    Driver.wait(4);
                    select3.selectByVisibleText("USA");
                case 4:
                    Select select4=new Select(t);
                    Driver.wait(4);
                    select4.selectByVisibleText("NEWYORK");
            }
        }
        ReusableMethods.waitFor(2);
        Driver.waitAndClick(adminPatientsPage.saveButton);
    }
    @Then("Verify the {string} should be provided as USA state and cannot be blank")
    public void verify_the_should_be_provided_as_usa_state_and_cannot_be_blank(String string) {
        Driver.waitAndClick(adminPatientsPage.createdDateButton);
        for (WebElement w: adminPatientsPage.table){
            if (w.getText().contains(email){

            }
        }
    }
    @Then("Verify creating the new patient succesfully")
    public void verify_creating_the_new_patient_succesfully() {

    }
}
