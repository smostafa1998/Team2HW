package testBase;

import baseAPI.BasePage;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import pom.BookPage.BookHomePage;
import pom.FashionPage.FashionHomePage;
import pom.Homepage;

public class TestBase extends BasePage {

    public Homepage getHomepage(){
        return new Homepage();
    }

    public BookHomePage getBookPage(){
        return new BookHomePage();
    }

    public FashionHomePage getFashionPage(){
        return new FashionHomePage();
    }

    public boolean isElementPresent(WebElement element) {
        boolean flag = false;

        try {
            if (element.isDisplayed()) {
                flag = true;
            }
        } catch (ElementNotVisibleException e) {
            e.printStackTrace();
        }
        return flag;
    }


}
