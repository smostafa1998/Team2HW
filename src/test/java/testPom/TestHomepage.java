package testPom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.BookPage.BookHomePage;
import pom.FashionPage.FashionHomePage;
import pom.Homepage;
import testBase.TestBase;


public class TestHomepage extends TestBase {

    /**
     * This is to test that from the amazon page it navigated to amazon book page
     */
    @Test
    public void testNavigateToBook(){
        Homepage homepage = getHomepage();
        BookHomePage bookpage = homepage.navigateToBookPage(); // to go from homepage to bookpage

        waitForElementToBeVisible(bookpage.bookLabel);
        waitForElementToContainText(bookpage.bookLabel,"Books at Amazon");
        String actualText = bookpage.bookLabel.getText();
        String expectedText = "Books at Amazon";
        Assert.assertEquals(expectedText, actualText);
        System.out.println("FOUND BOOK WEBSITE");
    }

    /**
     * This is to test that from the amazon page it navigated to amazon fashion page
     */
    @Test
    public void testNavigateToFashion(){
        Homepage homepage = getHomepage();
        FashionHomePage fashionpage = homepage.navigateToFashionPage();

        waitForElementToBeVisible(fashionpage.womenLabel);
        waitForElementToContainText(fashionpage.womenLabel,"Women");
        String actualText = fashionpage.womenLabel.getText();
        String expectedText = "Women";
        Assert.assertEquals(expectedText, actualText);
        System.out.println("FOUND FASHION WEBSITE");
    }


}
