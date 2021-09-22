package testPom.TestBookPage;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pom.BookPage.BookElement1;
import pom.BookPage.BookHomePage;
import pom.Homepage;
import testBase.TestBase;

public class TestBookElement1 extends TestBase {
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
}
