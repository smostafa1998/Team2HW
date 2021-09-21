package pom.FashionPage;

import baseAPI.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FashionElement1 extends BasePage {
    public FashionElement1() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"sobe_d_b_4_1\"]/a")
    public WebElement WomenClothes;

}
