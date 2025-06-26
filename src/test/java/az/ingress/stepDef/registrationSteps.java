package az.ingress.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static az.ingress.DriverUtils.DriverUtils.getDriver;
import static az.ingress.POM.registrationPOM.*;
import static az.ingress.enums.ExpectedConditionsTypes.CLICKABLE;
import static az.ingress.enums.ExpectedConditionsTypes.VISIBLE;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class registrationSteps extends BaseMethods {

    //Scenario: yanlis parol ile daxil olmag calisiram //1
    @Given("facebook sehifesine klikleyirem")
    public void facebookSehifesineKlikleyirem() {

        getDriver().get("https://www.facebook.com/");

    }

    @When("Create new account hissesine klikleyirem")
    public void createNewAccountHissesineKlikleyirem() {
        explicitlyWait(30, newAccountBtn, VISIBLE);
        getWebElement(newAccountBtn).click(); //When

    }

    @And("firstname hissesini bos saxlayiram")
    public void firstnameHissesiniBosSaxlayiram() {

        // No action needed, just leaving the field empty
    }

    @And("lastname hissesine istifadeci adini yaziram")
    public void lastnameHissesineIstifadeciAdiniYaziram() {
        explicitlyWait(5, lastName, CLICKABLE);
        getWebElement(lastName).sendKeys("Ali"); //And
    }

    @And("dogum tarixi gun yaziram")
    public void dogumTarixiGunYaziram() {

        Select daySelect = new Select(getWebElement(birthdayDay));
        daySelect.selectByVisibleText("15"); // Select a day from the dropdown

    }

    @And("dogum tarixi ay yaziram")
    public void dogumTarixiAyYaziram() {
        Select monthSelect = new Select(getWebElement(birthdayMonth));
        monthSelect.selectByVisibleText("May"); // Select a month from the dropdown

    }

    @And("dogum tarixi il yaziram")
    public void dogumTarixiIlYaziram() {
        Select yearSelect = new Select(getWebElement(birthdayYear));
        yearSelect.selectByVisibleText("1990"); // Select a year from the dropdown
    }


    @And("cinsiyet secimini edirem")
    public void cinsiyetSeciminiEdirem() {

        explicitlyWait(5, genderMale, CLICKABLE);
        getWebElement(genderMale).click(); //And
    }

    @And("email hissesine istifadeci emailini yaziram")
    public void emailHissesineIstifadeciEmailiniYaziram() {
        explicitlyWait(5, email, CLICKABLE);
        getWebElement(email).sendKeys("+994555555555"); //And
    }

    @And("password hissesine parol yaziram")
    public void passwordHissesineParolYaziram() {

        explicitlyWait(5, password, CLICKABLE);
        getWebElement(password).sendKeys("TestPassword123!"); //And
    }

    @And("signup duymesini klikleyirem")
    public void signupDuymesiniKlikleyirem() {
        explicitlyWait(5, signUpBtn, CLICKABLE);
        getWebElement(signUpBtn).click(); //And

    }

    @Then("xeta mesaji ekranda gorunmelidir")
    public void xetaMesajiEkrandaGorunmelidir() {

        explicitlyWait(10, errorMsj, VISIBLE);
        assertTrue(getWebElement(errorMsj).getText().contains("What’s your name?"));

    }

}
