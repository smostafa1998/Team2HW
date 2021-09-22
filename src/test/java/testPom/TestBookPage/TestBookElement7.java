package testPom.TestBookPage;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pom.BookPage.BookElement7;
import pom.BookPage.BookHomePage;
import pom.Homepage;
import testBase.TestBase;

public class TestBookElement7 extends TestBase {

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


}
