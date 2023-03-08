package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminHomePage {

    public AdminHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "account-menu")
    public WebElement adminNameButton;

    @FindBy(id = "entity-menu")
    public WebElement adminItemsTitlesButton;

    @FindBy(className = "dropdown-item active")
    public WebElement adminMessagesOption;


}


