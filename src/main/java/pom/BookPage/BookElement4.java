package pom.BookPage;

import baseAPI.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookElement4 extends BasePage {

    public BookElement4(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[contains(@id,'contentGrid_')]/div/div[1]/div/div/div/h2")
    public WebElement childrenBooks;

}
