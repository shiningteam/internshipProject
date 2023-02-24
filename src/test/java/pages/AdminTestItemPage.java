package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminTestItemPage {
    //https://www.medunna.com/c-test-item/new

    public AdminTestItemPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
