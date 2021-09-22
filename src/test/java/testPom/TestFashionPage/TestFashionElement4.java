package testPom.TestFashionPage;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pom.FashionPage.FashionElement4;
import pom.FashionPage.FashionHomePage;
import pom.Homepage;
import testBase.TestBase;

public class TestFashionElement4 extends TestBase {

    @Test(enabled = true)
    public void verifyInFashionHomePage4(){
        Homepage homepage = getHomepage();
        FashionHomePage fashionpage = homepage.navigateToFashionPage();
        FashionElement4 fashionElement4 = fashionpage.navigateToFashionElement4();
        waitForElementToBeVisible(fashionElement4.plusLink);
        clickOnElement(fashionElement4.plusLink);
        waitForElementToBeVisible(fashionElement4.activeLink);
        clickOnElement(fashionElement4.activeLink);
        waitForElementToContainText(fashionElement4.plusText,"Plus Size");
        String actualText = fashionElement4.plusText.getText();
        String expectedText = "Plus Size";
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualText,expectedText);
        softAssert.assertAll();
        System.out.println("Plus Size");
        System.out.println("DONE");
    }
}
