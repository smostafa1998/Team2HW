package testPom.TestBookPage;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.BookPage.*;
import pom.Homepage;
import testBase.TestBase;

public class TestBookHomePage extends TestBase {



    /*

    @Test(enabled = false)
    public void verifyInBookHomePage() {
        //TestBookHomePage
        Homepage homepage = getHomepage();
        // BookHomePage bookpage = getBookPage();
        //goes to book page
        BookHomePage bookpage = homepage.navigateToBookPage();
        // check to see element
        // Actions actions = new Actions(driver);
        //actions.moveToElement(bookpage.BookElementLinkObject1);
        //actions.perform();

        waitForElementToContainText(bookpage.BookElementLinkObject1,"Peril");
        BookElement1 bookElement1 = bookpage.navigateToBookElement1();
        // find the element to verify
        waitForElementToBeVisible(bookElement1.getProductTitle);
        waitForElementToContainText(bookElement1.getProductTitle, "Peril");
        String actualText = bookElement1.getProductTitle.getText();
        String expectedText = "Peril";
        Assert.assertEquals(expectedText, actualText);
        System.out.println("FOUND BOOK");
    }

    @Test
    public void verifyInBookHomePage2(){
        Homepage homepage = getHomepage();
        BookHomePage bookpage = homepage.navigateToBookPage();
        waitForElementToContainText(bookpage.BookElementLinkObject2,"Amplify Black Voices");
        BookElement2 bookElement2 = bookpage.navigateToBookElement2();
        waitForElementToBeVisible(bookElement2.getAABio);
        waitForElementToContainText(bookElement2.getAABio ,"AFRICAN AMERICAN BIOGRAPHIES");
        String actualText = bookElement2.getAABio.getText();
        String expectedText = "AFRICAN AMERICAN BIOGRAPHIES";
        Assert.assertEquals(expectedText, actualText);
        System.out.println("FOUND AFRICAN AMERICAN BIOGRAPHIES");
    }

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
        Assert.assertEquals(expectedText, actualText);
        System.out.println("Arts & Photography Books");
    }

    @Test
    public void verifyInBookHomePage5(){
        Homepage homepage = getHomepage();
        BookHomePage bookpage = homepage.navigateToBookPage();
        clickOnElement(bookpage.BookElementLinkObject5);
        BookElement5 bookElement5 = new BookElement5();
        waitForElementToBeVisible(bookElement5.EnglishResults);
        waitForElementToContainText(bookElement5.EnglishResults,"1-16 of over 70,000 results");
        String actualText = bookElement5.EnglishResults.getText();
        String expectedText = "1-16 of over 70,000 results";
        Assert.assertEquals(expectedText, actualText);
        System.out.println("1-16 of over 70,000 results");
        System.out.println("DONE");
    }

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
        Assert.assertEquals(expectedText, actualText);
        System.out.println("The Invisible Life of Addie LaRue, Special Edition");

    }
     */


}
