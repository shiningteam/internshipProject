package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminHomePage {

    public AdminHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
