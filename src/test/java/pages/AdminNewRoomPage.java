package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminNewRoomPage {
    //https://www.medunna.com/room/new

    public AdminNewRoomPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
