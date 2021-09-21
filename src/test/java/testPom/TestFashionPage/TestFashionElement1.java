package testPom.TestFashionPage;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.FashionPage.FashionElement1;
import pom.FashionPage.FashionHomePage;
import pom.Homepage;
import testBase.TestBase;

public class TestFashionElement1 extends TestBase {

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
}
