package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PhysicianMyAppointmentPage {
    public PhysicianMyAppointmentPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
