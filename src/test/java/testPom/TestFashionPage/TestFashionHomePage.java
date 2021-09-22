package testPom.TestFashionPage;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pom.FashionPage.*;
import pom.Homepage;
import testBase.TestBase;

public class TestFashionHomePage extends TestBase {
    /*
    @Test
    public void verifyInFashionHomePage1(){
        Homepage homepage = getHomepage();
        FashionHomePage fashionpage = homepage.navigateToFashionPage();
        FashionElement1 fashionElement1 = fashionpage.navigateToFashionElement1();
        waitForElementToBeVisible(fashionElement1.WomenClothes);
        waitForElementToContainText(fashionElement1.WomenClothes,"Clothing");
        String actualText = fashionElement1.WomenClothes.getText();
        String expectedText = "Clothing";
        Assert.assertEquals(expectedText, actualText);
        System.out.println("Clothing");
    }

    @Test (enabled = true)
    public void verifyInFashionHomePage2(){
        Homepage homepage = getHomepage();
        FashionHomePage fashionpage = homepage.navigateToFashionPage();
        FashionElement2 fashionElement2 = fashionpage.navigateToFashionElement2();
        waitForElementToBeVisible(fashionElement2.Featured_categories);
        waitForElementToContainText(fashionElement2.Featured_categories ,"Featured categories");
        String actualText = fashionElement2.Featured_categories.getText();
        String expectedText = "Featured categories";
        Assert.assertEquals(expectedText, actualText);
        System.out.println("Featured categories");
    }

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
       // System.out.println("Added to Cart");
   // }
}
