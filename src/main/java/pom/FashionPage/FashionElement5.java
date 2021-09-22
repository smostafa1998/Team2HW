package pom.FashionPage;

import baseAPI.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FashionElement5 extends BasePage {
    public FashionElement5() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"sobe_d_b_3_6\"]")
    public WebElement bigAndTall;

    @FindBy(xpath = "//*[@id=\"search\"]//span[3]/div[2]/div[2]//div[3]/div[2]/h2/a")
    public WebElement clickOnItem;

    @FindBy(xpath="//*[@id=\"quantity\"]")
    public WebElement quantityItem;

    @FindBy(xpath="//*[@id=\"add-to-cart-button\"]")
    public WebElement addCartButton;

    @FindBy(xpath="//*[@id=\"huc-v2-order-row-confirm-text\"]/h1")
    public WebElement confirmationText;

    @FindBy(xpath="//*[@id=\"productTitle\"]")
    public WebElement titleItem;
}
