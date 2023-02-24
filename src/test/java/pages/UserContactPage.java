package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserContactPage {

    public UserContactPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
