package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminNewRoomPage {


    public AdminNewRoomPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
