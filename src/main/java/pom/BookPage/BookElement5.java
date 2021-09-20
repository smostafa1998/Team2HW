package pom.BookPage;

import baseAPI.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookElement5 extends BasePage {
    public BookElement5(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span")
    public WebElement EnglishResults;

}
