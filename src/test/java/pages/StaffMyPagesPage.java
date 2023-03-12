package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StaffMyPagesPage {
    public StaffMyPagesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "entity-menu")
    public WebElement MyPagesDropdown;


    @FindBy(xpath = "//*[@id=\"entity-menu\"]/div/a[1]/span")
    public WebElement SearchPatient;

}
