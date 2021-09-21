package testPom.TestBookPage;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.BookPage.BookElement2;
import pom.BookPage.BookHomePage;
import pom.Homepage;
import testBase.TestBase;

public class TestBookElement2 extends TestBase {
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

}
