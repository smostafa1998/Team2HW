package testPom.TestBookPage;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pom.BookPage.BookElement5;
import pom.BookPage.BookHomePage;
import pom.Homepage;
import testBase.TestBase;

public class TestBookElement5 extends TestBase {
    @Test
    public void verifyInBookHomePage5(){
        Homepage homepage = getHomepage();
        BookHomePage bookpage = homepage.navigateToBookPage();
        clickOnElement(bookpage.BookElementLinkObject5);
        BookElement5 bookElement5 = new BookElement5();
        waitForElementToBeVisible(bookElement5.EnglishResults);
        waitForElementToContainText(bookElement5.EnglishResults,"1-16 of over 80,000 results");
        String actualText = bookElement5.EnglishResults.getText();
        String expectedText = "1-16 of over 80,000 results";
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualText,expectedText);
        //Assert.assertEquals(expectedText, actualText);
        softAssert.assertAll();
        System.out.println("1-16 of over 80,000 results");
        System.out.println("DONE");
    }
}
