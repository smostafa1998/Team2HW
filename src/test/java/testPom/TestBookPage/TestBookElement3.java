package testPom.TestBookPage;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.BookPage.BookElement3;
import pom.BookPage.BookHomePage;
import pom.Homepage;
import testBase.TestBase;

public class TestBookElement3 extends TestBase {

    @Test
    public void verifyInBookHomePage3(){
        Homepage homepage = getHomepage();
        BookHomePage bookpage = homepage.navigateToBookPage();
        waitForElementToContainText(bookpage.BookElementLinkObject3,"Arts & Photography");
        BookElement3 bookElement3 = bookpage.navigateToBookElement3();
        waitForElementToBeVisible(bookElement3.ArtPhoto);
        waitForElementToContainText(bookElement3.ArtPhoto ,"Arts & Photography Books");
        String actualText = bookElement3.ArtPhoto.getText();
        String expectedText = "Arts & Photography Books";
        Assert.assertEquals(actualText,expectedText);
        System.out.println("Arts & Photography Books");
    }
}
