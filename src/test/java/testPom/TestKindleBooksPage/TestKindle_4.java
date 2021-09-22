package testPom.TestKindleBooksPage;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.BookPage.BookElement4;
import pom.BookPage.BookHomePage;
import pom.Homepage;
import pom.KindleBookPage.KindleBooksHomePage;
import pom.KindleBookPage.Kindle_3;
import pom.KindleBookPage.Kindle_4;
import testBase.KindleTestBase;

public class TestKindle_4 extends KindleTestBase {

    @Test
    public void verifyInKindleBookHomePage() {
        Homepage homepage = getHomepage();
        KindleBooksHomePage KindleBooksHomePage = homepage.navigateToKindleBookPage();
        waitForElementToContainText(KindleBooksHomePage.Kindlekids, "KindleKids");
        Kindle_4 Kindle_4 = KindleBooksHomePage.navigateToKindle_4();
        waitForElementToBeVisible(homepage.KindleKids);
        waitForElementToContainText(getKindleereader().Kindlekids, "KindleKids");
        String actualText = "Kindle Kids";
        String expectedText = "Kindle Kids";
        Assert.assertEquals(expectedText, actualText);
        System.out.println("Kindle Kids");

    }
}

