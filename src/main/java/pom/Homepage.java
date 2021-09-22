package pom;

import baseAPI.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pom.BookPage.BookHomePage;
import pom.KindleBookPage.KindleBooksHomePage;
import pom.KindleBookPage.Kindle_3;

public class Homepage extends BasePage {
    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    /**
     * This is the hamburger menu for the amazon page
     */
    @FindBy(xpath = "//*[@id=\"nav-hamburger-menu\"]")
    public WebElement AllTab;
    //clickOnElement


    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[1]/li[19]/a/div")
    public WebElement bookTabFind;

    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[12]/li[3]/a")
    public WebElement bookTabBook;

    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[1]/li[12]/a/i")
    public WebElement Kindleereader;

    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[7]/li[3]/a")
    public WebElement KindleKids;


    public BookHomePage navigateToBookPage() {
        clickOnElement(AllTab);
        clickOnElement(bookTabFind);
        clickOnElement(bookTabBook);
        System.out.println("clicked on book tab");

        return new BookHomePage();
    }

    public KindleBooksHomePage navigateToKindleBookPage() {
      clickOnElement(AllTab);
      clickOnElement(Kindleereader);
      clickOnElement(KindleKids);
      System.out.println("Kindlebooks");

        return new KindleBooksHomePage();
    }

}
