package pom.KindleBookPage;

import baseAPI.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kindle_5 extends BasePage {
    public Kindle_5(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//*[@id=\"imgTagWrapperId\"]")
    public WebElement KindleKidsResults;

}
