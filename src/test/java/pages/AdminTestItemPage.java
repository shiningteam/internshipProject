package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminTestItemPage {


    public AdminTestItemPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
