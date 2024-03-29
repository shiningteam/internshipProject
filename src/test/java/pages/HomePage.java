package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "account-menu")
    public WebElement userButton;

    @FindBy (id="login-item")
    public WebElement loginButton;

    @FindBy (xpath = "//span[contains(text(),'Register')]")
    public WebElement homePageDropDownRegisterButton;

    @FindBy (id= "login-item")
    public WebElement SignInButton;



    @FindBy(xpath = "//span[contains(text(),'Sign in')]")
    public WebElement homePageSignInButton;






}
