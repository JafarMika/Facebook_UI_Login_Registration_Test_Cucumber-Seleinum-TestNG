package az.ingress.stepDef;

import az.ingress.DriverUtils.DriverUtils;
import io.cucumber.java.en.*;

import static az.ingress.DriverUtils.DriverUtils.getDriver;
import static az.ingress.POM.loginPOM.*;
import static az.ingress.enums.ExpectedConditionsTypes.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class loginSteps extends BaseMethods {

    @Given("men facebook ana sehifesine gedirem")
    public void menFacebookAnaSehifesineGedirem() {
        getDriver().get("https://www.facebook.com/");
        System.out.println(getDriver());
    }

    @When("ad {string} hissesini yaziram")
    public void adHissesiniYaziram(String arg0) {
        if (!arg0.isEmpty()) {
            explicitlyWait(10, username, VISIBLE);
            getWebElement(username).sendKeys(arg0);  //When
        }
    }

    @And("parol {string} hissesini yaziram")
    public void parolHissesiniYaziram(String arg0) {
        if (!arg0.isEmpty()) {
            getWebElement(password).sendKeys(arg0);  //When
        }
    }

    @And("login duymesine sixiram")
    public void loginDuymesineSixiram() {

        explicitlyWait(10, loginBtn, CLICKABLE);
        getWebElement(loginBtn).click();
    }

    @Then("ekranda {string} mesaji gorunur")
    public void ekrandaMesajiGorunur(String arg0) {
        explicitlyWait(10, errorMsj, VISIBLE);
        String actualMsj = getWebElement(errorMsj).getText();
        assertTrue(actualMsj.contains(arg0));
    }
}
