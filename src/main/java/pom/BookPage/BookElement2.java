package pom.BookPage;

import baseAPI.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookElement2 extends BasePage {

    public BookElement2(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="a-autoid-6-announce")
    public WebElement getAABio;

}
