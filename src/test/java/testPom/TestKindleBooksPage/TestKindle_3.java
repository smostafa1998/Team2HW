package testPom.TestKindleBooksPage;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pom.BookPage.BookElement3;
import pom.BookPage.BookHomePage;
import pom.Homepage;
import pom.KindleBookPage.KindleBooksHomePage;
import pom.KindleBookPage.Kindle_1;
import pom.KindleBookPage.Kindle_3;
import testBase.KindleTestBase;

public class TestKindle_3 extends KindleTestBase {

    @Test(enabled = true)
    public void verifyInKindleBookHomePage(){
        Homepage homepage = getHomepage();
        KindleBooksHomePage KindleBooksHomePage = homepage.navigateToKindleBookPage();
        waitForElementToContainText(KindleBooksHomePage.Kindleereaders,"");
        Kindle_3 Kindle_3 = KindleBooksHomePage.navigateToKindle_3();
        waitForElementToBeVisible(homepage.Kindleereader);
        waitForElementToContainText(getKindleereader().Kindleereaders,"Kindle E Reader & Books");
        String actualText = "Kindle E Reader & Books";
        String expectedText = "Kindle E Reader";
        Assert.assertEquals(expectedText, actualText);
        System.out.println("Kindle E Reader Page");
    }
}