package pom.BookPage;

import baseAPI.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookElement3 extends BasePage {

    public BookElement3(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div[2]/div[1]/div[1]/div/h1/b")
    public WebElement ArtPhoto;
}
