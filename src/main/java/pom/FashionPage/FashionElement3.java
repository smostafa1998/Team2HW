package pom.FashionPage;

import baseAPI.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FashionElement3 extends BasePage {
    public FashionElement3() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"search\"]//div[2]/div[1]//h1/span")
    public WebElement textOnPage;

    @FindBy(xpath = "//*[@id=\"low-price\"]")
    public WebElement lowPrice;

    @FindBy(xpath = "//*[@id=\"high-price\"]")
    public WebElement highPrice;

    @FindBy(xpath = "//*[@id=\"a-autoid-1\"]/span/input")
    public WebElement goButton;

    @FindBy(xpath = "//*[@id=\"search\"]//span[3]/div[2]/div[2]//div[2]//h5/span")
    public WebElement brandName;
}
