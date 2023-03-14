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
    @FindBy(id = "patient-cstate")
    public WebElement state;
    @FindBy(id = "save-entity")
    public WebElement saveButton;
    @FindBy(xpath = "//thead/tr[1]/th[12]/*[1]")
    public WebElement createdDateButton;
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[16]/div[1]/a[1]/span[1]/span[1]")
    public WebElement viewButton;
    @FindBy(xpath = "//dd[contains(text(),'USA')]")
    public WebElement countryUSA;
    @FindBy(xpath = "//dd[contains(text(),'OHIO')]")
    public WebElement stateUSA;
    @FindBy(linkText = "Patients")
    public WebElement editPagePatientsLink;
    @FindBy(xpath = "//tbody//tr//td")
    public List<WebElement> table;


}
