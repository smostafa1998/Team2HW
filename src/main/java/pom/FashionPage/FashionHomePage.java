package pom.FashionPage;

import baseAPI.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FashionHomePage extends BasePage {
    public FashionHomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"sobe_d_b_4_1\"]/a")
    public WebElement WomenClothesLabel;

    @FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[2]/span[1]")
    public WebElement womenLabel;

    @FindBy(xpath = "//*[@id=\"nav-flyout-aj:https://softlines-trova.s3-us-west-2.amazonaws.com/prod/US/mediaservice/megamenucreator_basic_en_US.json:subnav-sl-megamenu-1:0\"]/div[2]//div[1]/ul[1]/li[2]/a")
    public WebElement Dresses;

    @FindBy(xpath="//*[@id=\"nav-subnav\"]/a[7]/span[1]")
    public WebElement newArrivals;

    @FindBy(xpath="//*[@id=\"nav-flyout-aj:https://softlines-trova.s3-us-west-2.amazonaws.com/prod/US/mediaservice/megamenucreator_basic_en_US.json:subnav-sl-megamenu-8:0\"]/div[2]/div/div[6]/a/ul/li[1]/h3")
    public WebElement newArrivalsLink;

    @FindBy(xpath="//*[@id=\"nav-subnav\"]/a[3]/span[1]")
    public WebElement menLink;

    public FashionElement1 navigateToFashionElement1() {
        clickOnElement(womenLabel);
        return new FashionElement1();
    }

    public FashionElement2 navigateToFashionElement2() {
        waitForElementToBeVisible(womenLabel);
        Actions a = new Actions(driver);
        a.moveToElement(womenLabel).build().perform();
        waitForElementToBeVisible(Dresses);
        a.moveToElement(Dresses).build().perform();
        clickOnElement(Dresses);
        return new FashionElement2();
    }

    public FashionElement3 navigateToFashionElement3(){
        waitForElementToBeVisible(newArrivals);
        Actions a = new Actions(driver);
        a.moveToElement(newArrivals).build().perform();
        waitForElementToBeVisible(newArrivalsLink);
        a.moveToElement(newArrivalsLink).build().perform();
        clickOnElement(newArrivalsLink);
        return new FashionElement3();
    }

    public FashionElement4 navigateToFashionElement4(){
        clickOnElement(WomenClothesLabel);
        return new FashionElement4();
    }

    public FashionElement5 navigateToFashionElement5(){
        clickOnElement(menLink);
        return new FashionElement5();
    }


}
