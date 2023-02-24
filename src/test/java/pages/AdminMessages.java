package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminMessages {

    public AdminMessages (){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
