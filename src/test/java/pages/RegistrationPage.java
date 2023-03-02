package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegistrationPage {
    public RegistrationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "firstPassword")
    public WebElement newPassword;

    @FindBy(id = "secondPassword")
    public WebElement passwordConfirm;

    @FindBy(id = "strengthBar")
    public WebElement strengthBar;

    @FindBy(xpath = "(//li[@class='point'])[1]")
    public WebElement strengthBar1;

    @FindBy(xpath = "(//li[@class='point'])[2]")
    public WebElement strengthBar2;

    @FindBy(xpath = "(//li[@class='point'])[3]")
    public WebElement strengthBar3;

    @FindBy(xpath = "(//li[@class='point'])[4]")
    public WebElement strengthBar4;

    @FindBy(xpath = "(//li[@class='point'])[5]")
    public WebElement strengthBar5;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(linkText = "Your username is invalid." )
    public WebElement usernameInvalid;

    @FindBy(linkText = "Your username is required." )
    public WebElement usernameRequired;

    @FindBy(linkText = "Your email is required." )
    public WebElement emailRequired;

    @FindBy(linkText = "This field is invalid" )
    public WebElement emailInvalid;




}
