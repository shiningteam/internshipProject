package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StaffMyPagesPage {
    public StaffMyPagesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id= "jh-create-entity")
    public WebElement createANewStaffButton;

    @FindBy (id="useSSNSearch")
    public WebElement SsnSearchRadioButton;

    @FindBy (id="searchSSN")
    public WebElement SsnBox;

    @FindBy (xpath = "//button[@class='btn btn-secondary']")
    public WebElement searchUserButton;

    @FindBy (xpath = "//div[contains(text(),'User found with search SSN')]")
    public WebElement alert;

    @FindBy(id="appointment-heading")
    public WebElement appointmentsHead;

    @FindBy(xpath = "//a[@href='/appointment-update/24475']")
    public WebElement editAppointment;

    @FindBy(xpath = "//span[contains(text(),'Show Appointments')]")
    public WebElement showAppointments;

    @FindBy(xpath = "//span[contains(text(),'Create or Edit an Appointment')]")
    public WebElement editAppointmentsHead;

    @FindBy(xpath = "//select[@id='appointment-status']")
    public WebElement status;

    @FindBy(id = "appointment-anamnesis")
    public WebElement anamnesis;

    @FindBy(id = "appointment-treatment")
    public WebElement treatment;

    @FindBy(id = "appointment-diagnosis")
    public WebElement diagnosis;

    @FindBy(id = "save-entity")
    public WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'The Appointment is updated with identifier 24475')]")
    public WebElement alertSave;

    @FindBy (id = "appointment-physician")
    public WebElement physician;

    @FindBy(xpath = "//a[@href='/tests/appointment/24475']")
    public WebElement showTests;

    @FindBy(xpath = "//span[contains(text(),'Tests')]")
    public WebElement testsHead;




}
