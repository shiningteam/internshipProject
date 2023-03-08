package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class PhysicianTestItems {
    public PhysicianTestItems(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//tbody//tr//td//input")
    public List<WebElement> tests;

    @FindBy(id = "save-entity")
    public WebElement saveButton;

    @FindBy(xpath = "(//tr//td[@class='text-right'])[3]")
    public WebElement viewResultsButton;

    @FindBy(xpath = "//div//table//tbody//tr//td")
    public List<WebElement> testInfo;


}

