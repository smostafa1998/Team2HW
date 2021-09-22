package testPom.TestFashionPage;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pom.FashionPage.FashionElement5;
import pom.FashionPage.FashionHomePage;
import pom.Homepage;
import testBase.TestBase;

public class TestFashionElement5 extends TestBase {

    @Test(enabled = true)
    public void verifyInFashionHomePage5() {
        Homepage homepage = getHomepage();
        FashionHomePage fashionpage = homepage.navigateToFashionPage();
        FashionElement5 fashionElement5 = fashionpage.navigateToFashionElement5();
        waitForElementToBeVisible(fashionElement5.bigAndTall);
        clickOnElement(fashionElement5.bigAndTall);
        clickOnElement(fashionElement5.clickOnItem);
        waitForElementToBeVisible(fashionElement5.titleItem);
        String actualText = fashionElement5.titleItem.getText();
        String expectedText = "YTD Men's Shorts Casual Classic Fit Drawstring Summer Beach Shorts with Elastic Waist and Pockets";
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualText, expectedText);
        softAssert.assertAll();
        System.out.println("YTD Men's Shorts Casual Classic Fit Drawstring Summer Beach Shorts with Elastic Waist and Pockets");
        Select count = new Select(fashionElement5.quantityItem);
        count.selectByIndex(9);// picks 10 items
        clickOnElement(fashionElement5.addCartButton);
       /* waitForElementToBeVisible(fashionElement5.confirmationText);
        String actualText = fashionElement5.confirmationText.getText();
        String expectedText = "Added to Cart";
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualText, expectedText);
        softAssert.assertAll();*/
        System.out.println("Added to Cart");
    }
}
