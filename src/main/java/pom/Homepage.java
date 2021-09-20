package pom;

import baseAPI.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pom.BookPage.BookHomePage;

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

    /**
     * this is to navigate from homepage to bookpage
     */
    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[1]/li[19]/a/div")
    public WebElement bookTabFind;

    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[12]/li[3]/a")
    public WebElement bookTabBook;

    /**
     * Navigate to Book Page
     * @return
     */
    public BookHomePage navigateToBookPage() {
        clickOnElement(AllTab);
        clickOnElement(bookTabFind);
        clickOnElement(bookTabBook);
        System.out.println("clicked on book tab");

        return new BookHomePage();
    }


}
