package pom.BookPage;

import baseAPI.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookElement6 extends BasePage {
    public BookElement6() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//*[@id=\"asMain\"]/tbody/tr[1]/td[1]/div[2]/input")
    public WebElement authorBox;

    @FindBy(xpath="//*[@id=\"asMain\"]/tbody/tr[2]/td/input")
    public WebElement confirmClick;

    @FindBy(xpath="//*[@id=\"search\"]//div[1]//span[3]/div[2]/div[1]//span//div[2]//div[1]/h2/a/span")
    public WebElement confirmEditorsPick;
}

