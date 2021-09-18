package pom.BookPage;

import baseAPI.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookElement1 extends BasePage {

    public BookElement1(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="productTitle")
    public WebElement getProductTitle;


}
