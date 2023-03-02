package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PhysicianMyAppointmentPage {
    public PhysicianMyAppointmentPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[.='MY PAGES']")
    public WebElement myPagesDropdown;

    @FindBy(xpath = "//span[.='My Appointments']")
    public WebElement myAppointmentsOption;



  @FindBy(xpath = "//tr//td[.='10566']")
   public WebElement id10566;

  @FindBy(xpath = "(//span[@class='d-none d-md-inline'])[2]")
    public WebElement editButton;

  @FindBy(id = "appointment-id")
  public WebElement idInput;

    @FindBy(id = "appointment-startDate")
    public WebElement startDateInput;

    @FindBy(id = "appointment-endDate")
    public WebElement endDateInput;

    @FindBy(id = "appointment-status")
    public WebElement statusInput;

    @FindBy(id = "appointment-physician")
    public WebElement physicianInput;

    @FindBy(xpath = "//textarea[@id='appointment-anamnesis']")
    public WebElement anamnesisInput;

    @FindBy(xpath = "//textarea[@id='appointment-treatment']")
    public WebElement treatmentInput;

    @FindBy(xpath = "//textarea[@id='appointment-diagnosis']")
    public WebElement diagnosisInput;

    @FindBy(xpath = "//textarea[@id='appointment-description']")
    public WebElement descriptionInput;

    @FindBy(xpath = "//button[@id='save-entity']")
    public WebElement saveButton;

    @FindBy(xpath = "(//td[.='123456789'])[2]")
    public WebElement descriptionField;


}

