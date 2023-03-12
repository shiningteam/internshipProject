package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AdminHomePage {

    public AdminHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Items&Titles")
    public WebElement itemsTitlesIcon;

    @FindBy(xpath = "//div[@class='dropdown-menu dropdown-menu-right show']")
    public WebElement itemsTitlesDropdown;

    @FindBy(linkText = "Country")
    public WebElement country;

    @FindBy(linkText = "State/City")
    public WebElement stateCity;



}
