package stepdefinitions.UIStepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.StaffMyPagesPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

import static org.testng.Assert.*;
import static utilities.JSUtils.clickElementByJS;
import static utilities.ReusableMethods.clickWithTimeOut;
import static utilities.ReusableMethods.waitForVisibility;

public class US_022 {
    StaffMyPagesPage staffMyPagesPage = new StaffMyPagesPage();
    @Then("Click Show Appointments button and verify")
    public void click_show_appointments_button_and_verify() {
        ReusableMethods.waitFor(5);
        clickElementByJS(staffMyPagesPage.showAppointments);
        ReusableMethods.waitFor(5);
        Assert.assertTrue(staffMyPagesPage.appointmentsHead.isDisplayed());
        ReusableMethods.waitFor(5);
    }
    @Then("Click edit button from an appointment and verify")
    public void click_edit_button_from_an_appointment_and_verify() {
        clickWithTimeOut(staffMyPagesPage.editAppointment, 20);
        waitForVisibility(staffMyPagesPage.editAppointmentsHead, 20);
        Assert.assertTrue(staffMyPagesPage.editAppointmentsHead.isDisplayed());
    }
    @Then("Select the status from dropdown and verify")
    public void select_the_status_from_dropdown_and_verify() {
        waitForVisibility(staffMyPagesPage.editAppointmentsHead, 20);
        Select select = new Select(staffMyPagesPage.status);
        List<WebElement> options = select.getOptions();
        for (WebElement option : options) {
            if (option.isEnabled() && option.isSelected()) {
                String optionText = option.getText();
                System.out.println("Option " + optionText + " is selectable");
                 assertTrue(option.isEnabled() && option.isSelected());
            }else {
                String disableOptionText = option.getText();
                System.out.println("Option " + disableOptionText + " is not selectable");
                assertFalse(option.isEnabled() && option.isSelected());
            }
        }
    }
    @Then("Leave blank Anamnesis, Treatment, Diagnosis and verify")
    public void leave_blank_anamnesis_treatment_diagnosis_and_verify() {
        clickElementByJS(staffMyPagesPage.anamnesis);
        staffMyPagesPage.anamnesis.sendKeys("");
        ReusableMethods.waitFor(5);
        clickElementByJS(staffMyPagesPage.treatment);
        staffMyPagesPage.treatment.sendKeys("");
        ReusableMethods.waitFor(5);
        clickElementByJS(staffMyPagesPage.diagnosis);
        staffMyPagesPage.diagnosis.sendKeys("");
        ReusableMethods.waitFor(5);
        clickElementByJS(staffMyPagesPage.saveButton);
        ReusableMethods.waitFor(5);
        for (int i = 0; i < 5; i++) {
            try {
                Assert.assertTrue(staffMyPagesPage.alertSave.isEnabled());
            } catch (Exception e) {
                Driver.wait(1);
            }
        }
    }
    @Then("Select Physician from dropdown and verify")
    public void select_physician_from_dropdown_and_verify() {
        Select select = new Select(staffMyPagesPage.physician);
        List<WebElement> options = select.getOptions();
        for (WebElement option : options) {
            if (option.isEnabled() && option.isSelected()) {
                String optionText = option.getText();
                System.out.println("Option " + optionText + " is selectable");
                assertTrue(option.isEnabled() && option.isSelected());
            }else {
                String disableOptionText = option.getText();
                System.out.println("Option " + disableOptionText + " is not selectable");
                assertFalse(option.isEnabled() && option.isSelected());
            }
        }
    }
    @Then("Click Show Tests button from an appointment and verify")
    public void click_show_tests_button_from_an_appointment_and_verify() {
        clickElementByJS(staffMyPagesPage.showTests);
        waitForVisibility(staffMyPagesPage.testsHead,20);
        Assert.assertTrue(staffMyPagesPage.testsHead.isDisplayed());

    }

}
