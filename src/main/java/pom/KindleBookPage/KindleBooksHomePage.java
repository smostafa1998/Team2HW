package pom.KindleBookPage;

import baseAPI.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pom.BookPage.*;
import pom.Homepage;

public class KindleBooksHomePage extends BasePage {


    public KindleBooksHomePage() {
            PageFactory.initElements(driver, this);
        }

        //these are all from the book homepage

        @FindBy(id="productTitle")
        public WebElement getproducttitle;

        @FindBy(xpath = "//*[@id =\"a-nav-hamburger-menu")
        public WebElement Alltabsbar;

        @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[1]/li[12]/a")
        public WebElement Kindleereaders;

        @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[7]/li[3]/a")
        public WebElement Kindlekids;

        //@FindBy(xpath = "//*[@id="hmenu-content"]/ul[7]/li[6]/a")
        public WebElement KindleOasis;

        //@FindBy(xpath = "//*[@id=\"widgetFilters\"]/div/div[3]/div[1]/a/div/div[2]/span")
        public WebElement BookElementLinkObject3;

        //@FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[5]/span")
        public WebElement BookElementLinkObject4;

        //@FindBy(xpath = "//*[@id=\"s-refinements\"]/div[7]/ul/li[1]/span/a/div/label/i")
        public WebElement BookElementLinkObject5;


        //@FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[2]/span")
        public WebElement BookElementLinkObject6;



        //this navigates from the og bookpage to the book peril page


        public Kindle_1 navigateToKindle_1() {
            clickOnElement(Kindlekids);
            return new Kindle_1();
        }

        public Kindle_2 navigateToKindle_2() {
            clickOnElement(Kindleereaders);
            return new Kindle_2();
        }

        public Kindle_3 navigateToKindle_3() {
            clickOnElement(Kindleereaders);
            return new Kindle_3();
        }

        public Kindle_4 navigateToKindle_4() {
            clickOnElement(Kindleereaders);
            return new Kindle_4();
        }


    }

