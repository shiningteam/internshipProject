package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminMessages {

    public AdminMessages (){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath="(//tr)[1]")
    public WebElement messagesTable;

    @FindBy(id="jh-create-entity")
    public WebElement createNewMessageButton;

    @FindBy(id="c-message-name")
    public WebElement nameForMessage;

    @FindBy(id="c-message-email")
    public WebElement emailForMessage;

    @FindBy(id="c-message-subject")
    public WebElement subjectForMessage;

    @FindBy(id="c-message-message")
    public WebElement messageForMessage;

    @FindBy(id="save-entity")
    public WebElement saveButton;

    @FindBy(xpath="//div[@style='pointer-events: none;']")
    public WebElement saveSuccessMessage;

    @FindBy(linkText="16608")
    public WebElement createdIdNumber;

    @FindBy(className="btn btn-primary btn-sm")
    public WebElement editButton;

    @FindBy(className="btn btn-danger btn-sm")
    public WebElement deleteButton;

    @FindBy(id="jhi-confirm-delete-cMessage")
    public WebElement confirmDeleteMessage;

    @FindBy(className="Toastify__toast-body")
    public WebElement deleteSuccessMessage;

}
