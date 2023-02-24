package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PatientAppointmentsPage {

    public PatientAppointmentsPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
