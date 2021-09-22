package pom.FashionPage;

import baseAPI.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FashionElement4 extends BasePage {
    public FashionElement4() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//*[@id=\"sobe_d_b_4_7\"]")
    public WebElement plusLink;

    @FindBy(xpath="//*[@id=\"sobe_d_b_4_6\"]")
    public WebElement activeLink;

    @FindBy(xpath="//*[@id=\"p_n_feature_fifteen_browse-bin-title\"]/span")
    public WebElement plusText;
}
