package az.ingress.stepDef;

import az.ingress.DriverUtils.DriverUtils;
import az.ingress.enums.ExpectedConditionsTypes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static az.ingress.DriverUtils.DriverUtils.getDriver;

public class BaseMethods  {

    public WebDriverWait wait;

    public void wait(int seconds) throws InterruptedException {
        TimeUnit.SECONDS.sleep(seconds);
    }

    public WebElement getWebElement(By locator){
        return getDriver().findElement(locator);
    }


    public void explicitlyWait(int seconds,By locator, ExpectedConditionsTypes conditions){
        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(seconds));
        switch (conditions){
            case CLICKABLE:
                wait.until(ExpectedConditions.elementToBeClickable(locator));
                break;
            case VISIBLE:
                wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
                break;
            case PRESENCE:
                wait.until(ExpectedConditions.presenceOfElementLocated(locator));
                break;
            case INVISIBLE:
                wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
                break;
            default:
                throw new IllegalArgumentException("Wrong ExpectedConditions type : "+conditions);


        }


    }
}
