package testPom.TestBookPage;

import org.openqa.selenium.support.ui.Select;
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
        softAssert.assertAll();
        System.out.println("The Invisible Life of Addie LaRue, Special Edition");

    }

    @Test
    public void verifyInBookHomePage6Part2(){
        Homepage homepage = getHomepage();
        BookHomePage bookpage = homepage.navigateToBookPage();
        clickOnElement(bookpage.BookElementLinkObject6);
        BookElement6 bookElement6 = bookpage.navigateToBookElement6();
        waitForElementToBeVisible(bookElement6.keywordInput);
        sendKeysToElement(bookElement6.keywordInput,"horror");
        Select conditions = new Select(bookElement6.conditionSelect);
        conditions.selectByIndex(1); //New
        Select formats = new Select(bookElement6.formatSelect);
        formats.selectByVisibleText("Paperback");
        Select genre = new Select(bookElement6.genreSelect);
        genre.selectByValue("18");
        clickOnElement(bookElement6.confirmClick);
        waitForElementToBeVisible(bookElement6.horrorProof);
        String actualText = bookElement6.horrorProof.getText();
        String expectedText = "\"horror\"";
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualText,expectedText);
        softAssert.assertAll();
        System.out.println("horror");
    }
}
