package testPom.TestKindleBooksPage;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pom.BookPage.BookElement1;
import pom.BookPage.BookHomePage;
import pom.Homepage;
import pom.KindleBookPage.KindleBooksHomePage;
import pom.KindleBookPage.Kindle_1;
import testBase.KindleTestBase;
import testBase.TestBase;

public class TestKindle_1 extends KindleTestBase {
    @Test(enabled = true)
    public void verifyKindleBooksHomePage() {
        //TestBookHomePage
        Homepage homepage = getHomepage();
        // BookHomePage bookpage = getBookPage();
        //goes to book page
        KindleBooksHomePage KindleBooksHomePage = homepage.navigateToKindleBookPage();
        // check to see element
        // Actions actions = new Actions(driver);
        //actions.moveToElement(bookpage.BookElementLinkObject1);
        //actions.perform();

        //waitForElementToContainText(KindleBooksHomePage.KindleBooksHomePage,"Kindle");
        Kindle_1 Kindle_1 = KindleBooksHomePage.navigateToKindle_1();
        // find the element to verify
        waitForElementToBeVisible(Kindle_1.getProductTitle);
        waitForElementToContainText(Kindle_1.getProductTitle, "Kindle");
        String actualText = Kindle_1.getProductTitle.getText();
        String expectedText = "Kindle";
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(expectedText, actualText);
        // Assert.assertEquals(expectedText, actualText);
        softAssert.assertAll();
        System.out.println("Kindle");
    }
}
