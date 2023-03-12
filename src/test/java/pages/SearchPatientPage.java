package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPatientPage {

   @FindBy(xpath = "//input[@name='ssn']")
   public WebElement ssnBar;

   @FindBy(linkText = "Show Appointments")
   public WebElement showAppointmentButton;


   @FindBy (xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/table/tbody/tr[1]/td[7]/div")
   public WebElement viewResultButton;

   @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/table/tbody/tr[8]/td[13]/div/a[2]")
   public WebElement showTestsButton;

   @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/table/tbody/tr[1]/td[9]/div/a" )
   public WebElement editTestButton;

   @FindBy(id = "c-test-result-result")
   public WebElement resultBar;

   @FindBy(id="save-entity")
   public WebElement saveButton;




}
