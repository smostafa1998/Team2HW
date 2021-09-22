package testPom.TestCustomerServicePage;

import testBase.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.openqa.selenium.support.PageFactory;
import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

public class TestCustomerServiceHomePage extends TestBase {

    public TestCustomerServiceHomePage() {
        PageFactory.initElements(driver, this);
    }

package baseAPI;


    public class BasePage {
        public static WebDriver driver;
        public static WebDriverWait webDriverWait;
        private Properties properties;
        public final String ABSOLUTE_PATH = System.getProperty("user.dir");
        private final String PROPERTIES_RELATIVE_PATH = "/src/main/resources/secret.properties";
        private final String PROP_FINAL_PATH = ABSOLUTE_PATH + PROPERTIES_RELATIVE_PATH;

        @BeforeSuite(alwaysRun = true)
        public void setUp(){
            try{
                properties = new Properties();
                FileInputStream fis = new FileInputStream(PROP_FINAL_PATH);
                properties.load(fis);
                System.out.println("DONE");
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        @Parameters({"browserName"})
        @BeforeMethod
        public void driverInit(@Optional("chrome") String browserName){
            driver = getLocalDriver(browserName);
            webDriverWait = new WebDriverWait(driver,20);
            //properties.getProperty("URL")
            String URL = "https://amazon.com";
            driver.get(URL);
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();

        }

        @AfterMethod
        public void tearDown(){
            driver.close();
        }

        @AfterSuite(alwaysRun = true)
        public void quitDriver(){
            driver.quit();
        }

        public static WebDriver getLocalDriver(String browserName){
            switch (browserName.toLowerCase().trim()) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                case "opera":
                    WebDriverManager.operadriver().setup();
                    driver = new OperaDriver();
                    break;
            }
            return driver;
        }

        public void clickOnElement(WebElement element) {
            try {
                webDriverWait.until(ExpectedConditions.elementToBeClickable(element)).click();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("COULD NOT CLICK ON ELEMENT");
            }
        }

        public void sendKeysToElement(WebElement element, String value) {
            try {
                element.sendKeys(value);
            } catch (TimeoutException e) {
                element.sendKeys(value);
            }
        }

        public List<WebElement> getListOfElements(By by) {
            try {
                webDriverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
            } catch (Exception e) {
                e.printStackTrace();
            }

            return driver.findElements(by);
        }



        /*
        SYNCHRONIZATION HELPER METHODS
         */
        public void waitForElementToBeVisible(WebElement element) {
            try {
                webDriverWait.until(ExpectedConditions.visibilityOf(element));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void waitForElementToContainText(WebElement element, String text) {
            try {
                webDriverWait.until(ExpectedConditions.textToBePresentInElement(element, text));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}