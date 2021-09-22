package pom.BookPage;

import baseAPI.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookElement7 extends BasePage {
    public BookElement7() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//*[contains(@id,\"contentGrid_\")]//div[4]//a")
    public WebElement manageRental;

    @FindBy(xpath="//*[@id=\"ap_email\"]")
    public WebElement emailInput;

    @FindBy(xpath="//*[@id=\"continue\"]")
    public WebElement continueButton;

    @FindBy(xpath="//*[@id=\"ap_password\"]")
    public WebElement passwordInput;

    @FindBy(xpath="//*[@id=\"signInSubmit\"]")
    public WebElement signInSubmit;

    @FindBy(xpath="//*[@id=\"auth-error-message-box\"]/div/h4")
    public WebElement errorMessageBox;

}
