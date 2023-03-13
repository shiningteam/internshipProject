package pages;

import groovy.transform.Field;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AdminPatientsPage {
    public AdminPatientsPage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(id = "jh-create-entity")
    public WebElement createNewPatientButton;

    @FindBy(xpath = "//div//label//span")
    public List<WebElement> patientInformationsInput;
    @FindBy(xpath = "//div//input")
    public List<WebElement> patientInformation1;
    @FindBy(xpath = "//div//select")
    public List<WebElement> patientInformation2;
    @FindBy(id = "save-entity")
    public WebElement saveButton;
    @FindBy(xpath = "//span[contains(text(),'Created Date')]")
    public WebElement createdDateButton;
    @FindBy(xpath = "//tbody//tr//td")
    public List<WebElement> table;


}
