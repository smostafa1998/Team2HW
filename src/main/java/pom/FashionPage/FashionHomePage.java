package pom.FashionPage;

import baseAPI.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FashionHomePage extends BasePage {
    public FashionHomePage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"sobe_d_b_4_1\"]/a")
    public WebElement WomenClothesLabel;

    @FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[2]/span[1]")
    public WebElement womenLabel;


    @FindBy(xpath="//*[@id=\"nav-flyout-aj:https://softlines-trova.s3-us-west-2.amazonaws.com/prod/US/mediaservice/megamenucreator_basic_en_US.json:subnav-sl-megamenu-1:0\"]/div[2]//div[1]/ul[1]/li[2]/a")
    public WebElement Dresses;


    public FashionElement1 navigateToFashionElement1(){
        clickOnElement(womenLabel);
        return new FashionElement1();
    }

    public FashionElement2 navigateToFashionElement2(){
        waitForElementToBeVisible(womenLabel);
        Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[2]/span[1]"))).build().perform();
        waitForElementToBeVisible(Dresses);
        a.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-flyout-aj:https://softlines-trova.s3-us-west-2.amazonaws.com/prod/US/mediaservice/megamenucreator_basic_en_US.json:subnav-sl-megamenu-1:0\"]/div[2]//div[1]/ul[1]/li[2]/a"))).build().perform();
        clickOnElement(Dresses);
        return new FashionElement2();
    }

}
