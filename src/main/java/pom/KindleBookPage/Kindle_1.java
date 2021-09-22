package pom.KindleBookPage;

import baseAPI.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kindle_1 extends BasePage{

    public Kindle_1(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="productTitle")
    public WebElement getProductTitle;

}
