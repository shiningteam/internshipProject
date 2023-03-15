package stepdefinitions.UIStepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.Driver;

public class US_025 {
    @Given("The user verifies he is in the  home page")
    public void the_user_verifies_s_he_is_in_the_home_page() {
            Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));
        String url = "Driver.getDriver().getCurrentUrl()";
        System.out.println("url = " + url);
        //Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"https://www.medunna.com/home");

    }
    @Given("The user verifies he is logged in as a patient.")
    public void the_user_verifies_s_he_is_logged_in_as_a_patient() {
    }
    @When("Click on MY PAGES\\(PATIENT) button.")
    public void click_on_my_pages_patient_button() {
    }
    @When("Click on My Appointments option.")
    public void click_on_my_appointments_option() {
    }
    @When("Click on Show Tests button to be able to see the related test result.")
    public void click_on_show_tests_button_to_be_able_to_see_the_related_test_result() {
    }
    @When("Click on View Results button.")
    public void clickOnViewResultsButton() {
    }
    @Then("Verifies that there can be seen  id, name for test, default max and min value, test date and description.")
    public void verifies_that_there_can_be_seen_id_name_for_test_default_max_and_min_value_test_date_and_description() {
    }

}
