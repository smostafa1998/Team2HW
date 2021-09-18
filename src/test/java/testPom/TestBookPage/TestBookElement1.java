package testPom.TestBookPage;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.BookPage.BookElement1;
import pom.BookPage.BookHomePage;
import pom.Homepage;
import testBase.TestBase;

public class TestBookElement1 extends TestBase {
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
}
