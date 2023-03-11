package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminCountryPage {
 public AdminCountryPage(){
     PageFactory.initElements(Driver.getDriver(), this);
 }

    @FindBy(id = "country-heading")
    public WebElement countryHeading;

    @FindBy(id = "country-name")
    public WebElement countryName;

    @FindBy(id = "save-entity")
    public WebElement saveButton;

    @FindBy(xpath = "//span[.='Create a new Country']")
    public WebElement createNewCountry;



}
