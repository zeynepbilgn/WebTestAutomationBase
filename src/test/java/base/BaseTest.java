package base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
    public WebDriver driver;
    String baseUrl = "https://n11.com";

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "web_driver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.navigate().to(baseUrl);
        driver.manage().window().maximize();
    }

    @After
    public void afterScenario() {
        driver.quit();
    }

}
