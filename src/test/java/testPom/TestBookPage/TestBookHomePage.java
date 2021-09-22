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
        Homepage homepage = getHomepage();
        BookHomePage bookpage = homepage.navigateToBookPage();
        BookElement1 bookElement1 = bookpage.navigateToBookElement1();
        waitForElementToBeVisible(bookElement1.getProductTitle);
        waitForElementToContainText(bookElement1.getProductTitle, "Peril");
        String actualText = bookElement1.getProductTitle.getText();
        String expectedText = "Peril";
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualText, expectedText);
        softAssert.assertAll();
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
        Assert.assertEquals(actualText,expectedText);
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
        Assert.assertEquals(actualText,expectedText);
        System.out.println("Arts & Photography Books");
    }

     @Test
    public void verifyInBookHomePage4(){
        Homepage homepage = getHomepage();
        BookHomePage bookpage = homepage.navigateToBookPage();
        waitForElementToContainText(bookpage.BookElementLinkObject4,"Children's Books");
        BookElement4 bookElement4 = bookpage.navigateToBookElement4();
        waitForElementToBeVisible(bookElement4.childrenBooks);
        waitForElementToContainText(bookElement4.childrenBooks,"Books for every age and stage");
        String actualText = bookElement4.childrenBooks.getText();
        String expectedText = "Books for every age and stage";
        Assert.assertEquals(actualText,expectedText);
        System.out.println("Books for every age and stage");

    }

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

       @Test
    public void verifyInBookHomePage7(){
        Homepage homepage = getHomepage();
        BookHomePage bookpage = homepage.navigateToBookPage();
        BookElement7 bookElement7 = bookpage.navigateToBookElement7();
        waitForElementToBeVisible(bookElement7.manageRental);
        clickOnElement(bookElement7.manageRental);
        String email = "smostafa1998@gmail.com";
        sendKeysToElement(bookElement7.emailInput,email);
        clickOnElement(bookElement7.continueButton);
        String password = "testing123";
        sendKeysToElement(bookElement7.passwordInput,password);
        clickOnElement(bookElement7.signInSubmit);
        waitForElementToBeVisible(bookElement7.errorMessageBox);
        String actualText = bookElement7.errorMessageBox.getText();
        String expectedText = "There was a problem";
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualText,expectedText);
        System.out.println("There was a problem");
    }


     */


}
