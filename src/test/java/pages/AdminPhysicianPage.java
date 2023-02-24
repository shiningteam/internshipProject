package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminPhysicianPage {
    //https://www.medunna.com/physician/new

    public AdminPhysicianPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
