package testPom.TestKindleBooksPage;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pom.Homepage;
import pom.KindleBookPage.KindleBooksHomePage;
import pom.KindleBookPage.Kindle_1;
import pom.KindleBookPage.Kindle_2;
import testBase.KindleTestBase;

public class TestKindle_2 extends KindleTestBase {
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
        Kindle_2 Kindle_2 = KindleBooksHomePage.navigateToKindle_2();
        // find the element to verify
        waitForElementToBeVisible(Kindle_2.Kindle);
        waitForElementToContainText(Kindle_2.Kindle, "Kindle");
        String actualText = Kindle_2.Kindle.getText();
        String expectedText = "Kindle";
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(expectedText, actualText);
        // Assert.assertEquals(expectedText, actualText);
        softAssert.assertAll();
        System.out.println("Kindle");
    }
}