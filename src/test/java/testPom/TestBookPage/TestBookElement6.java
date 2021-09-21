package testPom.TestBookPage;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pom.BookPage.BookElement6;
import pom.BookPage.BookHomePage;
import pom.Homepage;
import testBase.TestBase;

import java.awt.print.Book;

public class TestBookElement6 extends TestBase {
    @Test
    public void verifyInBookHomePage6(){
        Homepage homepage = getHomepage();
        BookHomePage bookpage = homepage.navigateToBookPage();
        clickOnElement(bookpage.BookElementLinkObject6);
        BookElement6 bookElement6 = bookpage.navigateToBookElement6();
        waitForElementToBeVisible(bookElement6.authorBox);
        sendKeysToElement(bookElement6.authorBox,"V.E Schwab");
        clickOnElement(bookElement6.confirmClick);
        waitForElementToBeVisible(bookElement6.confirmEditorsPick);
        waitForElementToContainText(bookElement6.confirmEditorsPick,"The Invisible Life of Addie LaRue, Special Edition");
        String actualText = bookElement6.confirmEditorsPick.getText();
        String expectedText = "The Invisible Life of Addie LaRue, Special Edition";
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualText,expectedText);
        //Assert.assertEquals(expectedText, actualText);
        softAssert.assertAll();
        System.out.println("The Invisible Life of Addie LaRue, Special Edition");

    }
}
