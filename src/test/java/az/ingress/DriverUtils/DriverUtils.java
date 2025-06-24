package az.ingress.DriverUtils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverUtils {

    public static WebDriver driver;


    @Before
    public void setupDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        options.addArguments("--incognito");
        options.addArguments("--allow-all-cookies");
        // options.addArguments("--headless");
        driver = new ChromeDriver(options);
    }

    @After
    public void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
