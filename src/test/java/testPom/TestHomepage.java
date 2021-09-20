package testPom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.BookPage.BookHomePage;
import pom.Homepage;
import testBase.TestBase;


public class TestHomepage extends TestBase {

    /**
     * This is to test that from the amazon page it navigated to amazon book page
     */
    @Test
    public void testNavigateToBook(){
        Homepage homepage = getHomepage();
        BookHomePage bookpage = homepage.navigateToBookPage();
        waitForElementToBeVisible(bookpage.bookLabel);
        waitForElementToContainText(bookpage.bookLabel,"Books at Amazon");
        String actualText = bookpage.bookLabel.getText();
        String expectedText = "Books at Amazon";
        Assert.assertEquals(expectedText, actualText);
        System.out.println("FOUND WEBSITE");
    }

}
