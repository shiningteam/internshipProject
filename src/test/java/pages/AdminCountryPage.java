package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AdminCountryPage {
 public AdminCountryPage(){
     PageFactory.initElements(Driver.getDriver(), this);
 }

    @FindBy(id = "country-heading")
    public WebElement countryHeading;

    @FindBy(id = "country-name")
    public WebElement countryName;

    @FindBy(id = "c-state-name")
    public WebElement cityName;

    @FindBy(name = "state.id")
    public WebElement countryDropdown;

    @FindBy(id = "save-entity")
    public WebElement saveButton;

    @FindBy(xpath = "//span[.='Create a new Country']")
    public WebElement createNewCountry;

    @FindBy(xpath = "//tbody//td[2]")
    public List<WebElement> countryList;

    @FindBy(id = "c-state-heading")
    public WebElement stateCityHeading;

    @FindBy(xpath = "//span[.='Create a new State/City']")
    public WebElement createNewCity;


}
