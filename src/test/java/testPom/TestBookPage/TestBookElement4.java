package testPom.TestBookPage;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.BookPage.BookElement4;
import pom.BookPage.BookHomePage;
import pom.Homepage;
import testBase.TestBase;

public class TestBookElement4 extends TestBase {

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
}
