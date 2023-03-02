package pages;

        import org.junit.Assert;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;
        import utilities.Driver;

public class SignInPage {
    public SignInPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="username")
    public WebElement userNameBox;

    @FindBy(id="password")
    public WebElement passwordBox;

    @FindBy(id="rememberMe")
    public WebElement rememberMeCheckBox;

    @FindBy(linkText = "Register a new account")
    public WebElement registrationLinkBox;

    @FindBy(xpath = "//*[contains(text(),'Cancel')]")
    public WebElement cancelButton;

    @FindBy(xpath = "//*[contains(text(),'Sign in')]")
    public WebElement signInButton;

    @FindBy(id="account-menu")
    public WebElement userAccount;

}
