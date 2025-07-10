package az.ingress.stepDef;

import az.ingress.DriverUtils.DriverUtils;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;

import static az.ingress.POM.registrationPOM.*;
import static az.ingress.enums.ExpectedConditionsTypes.*;
import static org.junit.Assert.assertEquals;

public class registrationSteps extends BaseMethods {

    @Given("facebook sehifesine klikleyirem")
    public void facebookSehifesineKlikleyirem() {

        DriverUtils.getDriver().get("https://www.facebook.com/");
    }

    @When("Create new account hissesine klikleyirem")
    public void createNewAccountHissesineKlikleyirem() {
        explicitlyWait(15, newAccountBtn, CLICKABLE);
        getWebElement(newAccountBtn).click();
    }

    @And("ad {string} hissesini doldururam")
    public void adHissesiniDoldururam(String arg0) {
        if (!arg0.isEmpty()) {
            explicitlyWait(10, firstName, VISIBLE);
            getWebElement(firstName).sendKeys(arg0);
        }
    }

    @And("soyad {string} hissesin doldururam")
    public void soyadHissesinDoldururam(String arg0) {
        if (!arg0.isEmpty()) {
            explicitlyWait(10, lastName, VISIBLE);
            getWebElement(lastName).sendKeys(arg0);
        }
    }

    @And("dogum tarixi {string} yaziram")
    public void dogumTarixiYaziram(String arg0) {
        if (!arg0.isEmpty()) {
            String[] date = arg0.split(" ");
            explicitlyWait(10, birthdayMonth, VISIBLE);
            getWebElement(birthdayMonth).sendKeys(date[0]);
            explicitlyWait(10, birthdayDay, VISIBLE);
            getWebElement(birthdayDay).sendKeys(date[1]);
            explicitlyWait(10, birthdayYear, VISIBLE);
            getWebElement(birthdayYear).sendKeys(date[2]);

        }
    }

    @And("cinsiyet {string} secimini edirem")
    public void cinsiyetSeciminiEdirem(String arg0) {
        if (!arg0.isEmpty()) {
            explicitlyWait(10, genderMale, VISIBLE);
            getWebElement(By.xpath("//*[text()='" + arg0 + "']")).click();
        }
    }

    @And("email {string} hissesini yaziram")
    public void emailHissesiniYaziram(String arg0) {
        if (!arg0.isEmpty()) {
            explicitlyWait(10, email, VISIBLE);
            getWebElement(email).sendKeys(arg0);

        }
    }

    @And("password {string} hissesini yaziram")
    public void passwordHissesiniYaziram(String arg0) {
        if (!arg0.isEmpty()) {
            explicitlyWait(10, password, VISIBLE);
            getWebElement(password).sendKeys(arg0);
        }
    }

    @And("Sign Up duymesini klikleyirem")
    public void signupDuymesiniKlikleyirem() {
        explicitlyWait(15, signUpBtn, CLICKABLE);
        getWebElement(signUpBtn).click();
    }

    @Then("xeta mesaji {string} ekranda gorunmelidir")
    public void xetaMesajiEkrandaGorunmelidir(String arg0) {

        explicitlyWait(30, errorMsjReg, VISIBLE);
        String actualError = getWebElement(errorMsjReg).getText();
        System.out.println("Gozlenilen error"+actualError);
        assertEquals(actualError, arg0);
    }

}
