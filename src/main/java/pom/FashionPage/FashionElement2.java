package pom.FashionPage;

import baseAPI.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FashionElement2 extends BasePage {
    public FashionElement2() {
        PageFactory.initElements(driver,this);
    }

    @FindBy (xpath="//*[@id=\"a-page\"]/div[2]/div[2]/div[1]/div[2]//div[1]/span")
    public WebElement Featured_categories;

}
