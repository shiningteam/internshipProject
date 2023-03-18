package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminStaffPage {
    public AdminStaffPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


  @FindBy(xpath = "//*[.='MY PAGES']")
  public WebElement myPagesDropdown;

  @FindBy(xpath = "//*[.='Search Patient']")
  public WebElement searchPatientOption;

  @FindBy(xpath = "//input[@ name='ssn']")
  public WebElement searchPatientWithSSN;

  @FindBy(xpath = "//table[@class='table']//tbody//tr[1]//td[3]")
  public WebElement  firstNameBox;

 @FindBy(xpath = "//table[@class='table']//tbody//tr[1]//td[16]//div//a[3]//span//span[contains(text(),'Show Appointments')]")
  // @FindBy(xpath = "//table[@class='table']//tbody//tr[1]//td[16]//div//a//span[contains(text(),'Show Appointments')]")
  public WebElement showAppointmentsIcon;

  @FindBy(xpath = " //table[@class='table']//tbody//tr[1]//td[4]")
  public WebElement patientStatusBox;

  @FindBy(xpath ="//table[@class='table']//tbody//tr[1]//td[13]//div//a[@class='btn btn-success btn-sm']")
  public WebElement paymentInvoiceIcon;

  @FindBy(xpath = "//th[contains(text(),'PAYMENT DETAIL')]")
  public WebElement paymentDetails;

  @FindBy(xpath = "//th[contains(text(),'INVOICE')]")
  public WebElement sentInvoice;

  @FindBy(xpath = "//*[contains(text(),'Show Invoice')]")
  public WebElement  showInvoiceIcon;

  @FindBy(xpath = "//*[.='Items&Titles']")
  public WebElement itemsTitlesButton;

    @FindBy(xpath = "//*[contains(text(),'Test Item')]")
    public WebElement testItemIcon;

    @FindBy(xpath = "//*[contains(text(),'Create a new Test Item')]")
    public WebElement newTestButton;

    @FindBy(id="c-test-item-name")
    public WebElement nameBox;

    @FindBy(id="c-test-item-description")
    public WebElement descriptionBox;

    @FindBy(id="c-test-item-price")
    public WebElement priceBox;

    @FindBy(id="c-test-item-defaultValMin")
    public WebElement defaultValMinBox;

    @FindBy(id="c-test-item-defaultValMax")
    public WebElement defaultValMaxBox;

    @FindBy(id="save-entity")
    public WebElement saveButton;

      // @FindBy(xpath = "//*[contains(text(),'Back')]")
    @FindBy(xpath = "//span[@class='d-none d-md-inline']")
    public WebElement backButton;

    @FindBy(xpath = "//table[@class='table']//tbody//tr[1]//td[8]//div//a[@class='btn btn-info btn-sm']")
    public WebElement viewBox;

    @FindBy(id="name")
    public WebElement nameTest;

  @FindBy(xpath = "//*[contains(text(),'Created Date')]")
  public WebElement createdDateButton;

  @FindBy(xpath = "//table[@class='table']//tbody//tr[1]//td[1]")
  public WebElement testNameToDelete;

    @FindBy(xpath = "//table[@class='table']//tbody//tr[1]//td[8]//div//a[@class='btn btn-primary btn-sm']")
    public WebElement editBox;

    @FindBy(xpath = "//table[@class='table']//tbody//tr[1]//td[8]//div//a[@class='btn btn-danger btn-sm']")
    public WebElement deleteBox;

    @FindBy(id="jhi-confirm-delete-cTestItem")
    public WebElement deleteConfirmButton;


}
