package pom.BookPage;

import baseAPI.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHomePage extends BasePage {
    public BookHomePage() {
        PageFactory.initElements(driver, this);
    }

    //these are all from the book homepage
    @FindBy(xpath = "//*[contains(@id,'contentGrid_')]//h2")
    public WebElement bookLabel;

    @FindBy(xpath = "//*[@id=\"anonCarousel1\"]/ol/li[1]/div/a[2]/span/div")
    public WebElement BookElementLinkObject1;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[1]/a")
    public WebElement BookElementLinkObject2;

    @FindBy(xpath = "//*[@id=\"widgetFilters\"]/div/div[3]/div[1]/a/div/div[2]/span")
    public WebElement BookElementLinkObject3;

    @FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[5]/span")
    public WebElement BookElementLinkObject4;

    @FindBy(xpath = "//*[@id=\"s-refinements\"]/div[7]/ul/li[1]/span/a/div/label/i")
    public WebElement BookElementLinkObject5;


    @FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[2]/span")
    public WebElement BookElementLinkObject6;


    //this navigates from the og bookpage to the book peril page
    public BookElement1 navigateToBookElement1() {
        clickOnElement(BookElementLinkObject1);
        return new BookElement1();
    }

    public BookElement2 navigateToBookElement2() {
        clickOnElement(BookElementLinkObject2);
        return new BookElement2();
    }

    public BookElement3 navigateToBookElement3() {
        clickOnElement(BookElementLinkObject3);
        return new BookElement3();
    }

    public BookElement4 navigateToBookElement4() {
        clickOnElement(BookElementLinkObject4);
        return new BookElement4();
    }

    public BookElement6 navigateToBookElement6() {
        clickOnElement(BookElementLinkObject6);
        return new BookElement6();
    }


}
