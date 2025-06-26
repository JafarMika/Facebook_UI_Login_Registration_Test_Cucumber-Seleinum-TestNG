package az.ingress.stepDef;

import az.ingress.DriverUtils.DriverUtils;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {

    @Before
    public void setupDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        options.addArguments("--incognito");
        // options.addArguments("--headless"); // lazım olsa aktiv et

        DriverUtils.driver = new ChromeDriver(options);
    }

    @After
    public void tearDown() {
        if (DriverUtils.driver != null) {
            DriverUtils.driver.quit();
            DriverUtils.driver = null;
        }
    }
}

