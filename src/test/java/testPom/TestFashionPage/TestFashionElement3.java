package testPom.TestFashionPage;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pom.FashionPage.FashionElement3;
import pom.FashionPage.FashionHomePage;
import pom.Homepage;
import testBase.TestBase;

public class TestFashionElement3 extends TestBase {

    @Test(enabled = true)
    public void verifyInFashionHomePage3(){
        Homepage homepage = getHomepage();
        FashionHomePage fashionpage = homepage.navigateToFashionPage();
        FashionElement3 fashionElement3 = fashionpage.navigateToFashionElement3();
        waitForElementToBeVisible(fashionElement3.textOnPage);
        sendKeysToElement(fashionElement3.lowPrice,"25");
        sendKeysToElement(fashionElement3.highPrice,"100");
        clickOnElement(fashionElement3.goButton);
        waitForElementToBeVisible(fashionElement3.brandName);
        String actualText = fashionElement3.brandName.getText();
        String expectedText = "adidas";
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualText,expectedText);
        softAssert.assertAll();
        System.out.println("adidas");
        System.out.println("DONE");

    }
}
