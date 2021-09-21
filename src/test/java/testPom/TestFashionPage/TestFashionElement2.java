package testPom.TestFashionPage;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.FashionPage.FashionElement2;
import pom.FashionPage.FashionHomePage;
import pom.Homepage;
import testBase.TestBase;

public class TestFashionElement2 extends TestBase {

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

    }
