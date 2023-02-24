package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StaffMyPagesPage {
    public StaffMyPagesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
