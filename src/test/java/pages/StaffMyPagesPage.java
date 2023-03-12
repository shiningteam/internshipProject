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

}
