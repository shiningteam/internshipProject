package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserPasswordPage {
    public UserPasswordPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
