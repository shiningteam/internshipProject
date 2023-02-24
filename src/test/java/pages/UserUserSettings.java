package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserUserSettings {
    public UserUserSettings(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
