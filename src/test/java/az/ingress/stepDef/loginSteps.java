package az.ingress.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static az.ingress.DriverUtils.DriverUtils.getDriver;
import static az.ingress.POM.loginPOM.*;
import static az.ingress.enums.ExpectedConditionsTypes.CLICKABLE;
import static az.ingress.enums.ExpectedConditionsTypes.VISIBLE;
import static org.junit.Assert.assertTrue;


public class loginSteps extends BaseMethods {


    //Scenario: Login with invalid password
    @Given("men facebook ana sehifesine gedirem")
    public void menFacebookAnaSehifesineGedirem() {
        getDriver().get("https://www.facebook.com/");
        System.out.println(getDriver());

    }

    @When("username hissesine istifadeci adini yaziram")
    public void usernameHissesineIstifadeciAdiniYaziram() {

        explicitlyWait(10, username, VISIBLE);
        getWebElement(username).sendKeys("+99945555555");  //When

    }

    @And("password hissesine yanlis parol yaziram")
    public void passwordHissesineYanlisParolYaziram() {

        explicitlyWait(5, password, VISIBLE);
        getWebElement(password).sendKeys("1234567765ali"); //ANd

    }

    @And("login duymesine sixiram")
    public void loginDuymesineSixiram() {
        explicitlyWait(5, loginBtn, CLICKABLE);
        getWebElement(loginBtn).click(); //And
    }

    @Then("xeta mesaji ekranda gorunur")
    public void xetaMesajiEkrandaGorunur() {
        explicitlyWait(5, errorMsj, VISIBLE);
        assertTrue(getWebElement(errorMsj).getText().contains("The email or mobile number you entered isn’t connected to an account. Find your account and log in.")); // Assertion to check the error message
    }

    //
    //Scenario: Login with invalid username and valid password
    @Given("facebook ana sehifesine gedirem")
    public void facebookAnaSehifesineGedirem() {
        getDriver().get("https://www.facebook.com/");
        System.out.println(getDriver());

    }


    @When("username hissesine yalnis username yaziram")
    public void usernameHissesineYalnisUsernameYaziram() {
        explicitlyWait(10, username, VISIBLE);
        getWebElement(username).sendKeys("+99945555555");  //When

    }

    @And("password hissesine dogru parol yaziram")
    public void passwordHissesineDogruParolYaziram() {
        explicitlyWait(5, password, VISIBLE);
        getWebElement(password).sendKeys("1234567765ali"); //ANd

    }

    @And("login duymesine basiram")
    public void loginDuymesineBasiram() {
        explicitlyWait(5, loginBtn, CLICKABLE);
        getWebElement(loginBtn).click(); //And

    }

    @Then("ekranda xeta mesaji gorunur")
    public void ekrandaXetaMesajiGorunur() {
        explicitlyWait(5, errorMsj, VISIBLE);
        assertTrue(getWebElement(errorMsj).getText().contains("The email or mobile number you entered isn’t connected to an account. Find your account and log in.")); // Assertion to check the error message

    }

    //
    //Scenario: Login with empty username and valid password
    @Given("facebook sehifesine gedirem")
    public void facebookSehifesineGedirem() {
        getDriver().get("https://www.facebook.com/");
        System.out.println(getDriver());
    }


    @When("username hissesini bos buraxiram")
    public void usernameHissesiniBosBuraxiram() {
    }

    @And("password hissesine duzgun parol yaziram")
    public void passwordHissesineDuzgunParolYaziram() {
        explicitlyWait(10, password, VISIBLE);
        getWebElement(password).sendKeys("Mikayilzade.95");  //When
    }

    @And("login duymesini basiram")
    public void loginDuymesiniBasiram() {
        explicitlyWait(10, loginBtn, CLICKABLE);
        getWebElement(loginBtn).click();

    }

    @Then("ekranda xeta mesaji cixir")
    public void ekrandaXetaMesajiCixir() {
        explicitlyWait(10, errorMsj, VISIBLE);
        assertTrue(getWebElement(errorMsj).getText().contains("The email or mobile number you entered isn’t connected to an account. Find your account and log in.")); // Assertion to check the error message
    }

    //Scenario: Login with valid username and empty password
    @Given("facebook sehifesine kecid edirem")
    public void facebookSehifesineKecidEdirem() {

        getDriver().get("https://www.facebook.com/");
    }

    @When("username hissesine dogru deyer yaziram")
    public void usernameHissesineDogruDeyerYaziram() {

        explicitlyWait(10, username, VISIBLE);
        getWebElement(username).sendKeys("+994555555555");  //When
    }

    @And("password hissesini bos buraxiram")
    public void passwordHissesiniBosBuraxiram() {

        explicitlyWait(10, password, VISIBLE);
        getWebElement(password).sendKeys("");  //When
   }

    @And("login duymesini klikleyirem")
    public void loginDuymesiniKlikleyirem() {

        explicitlyWait(10, loginBtn, CLICKABLE);
        getWebElement(loginBtn).click(); //And
    }

    @Then("ekrana xeta mesaji gelir")
    public void ekranaXetaMesajiGelir() {
        explicitlyWait(60, errorMsj, VISIBLE);
        System.out.println(getWebElement(errorMsj).getText());
        assertTrue(getWebElement(errorMsj).getText().contains("The password you’ve entered is incorrect.Forgot Password?")); // Assertion to check the error message
    }

    //Scenario: Login with empty username and empty password
    @Given("facebook sehifesine kecirem")
    public void facebookSehifesineKecirem() {

        getDriver().get("https://www.facebook.com/");
        System.out.println(getDriver());
    }

    @When("username hissesini bos qoyuram")
    public void usernameHissesiniBosQoyuram() {

        explicitlyWait(10, username, VISIBLE);
        getWebElement(username).sendKeys("");  //When
    }

    @And("password hissesini bos qoyuram")
    public void passwordHissesiniBosQoyuram() {

        explicitlyWait(10, password, VISIBLE);
        getWebElement(password).sendKeys("");  //When
    }

    @And("login duymesine klikleyirem")
    public void loginDuymesineKlikleyirem() {
        explicitlyWait(10, loginBtn, CLICKABLE);
        getWebElement(loginBtn).click(); //And
    }

    @Then("ekranda xeta mesaji gelir")
    public void ekrandaXetaMesajiGelir() {
        explicitlyWait(10, errorMsj, VISIBLE);
        assertTrue(getWebElement(errorMsj).getText().contains("The email or mobile number you entered isn’t connected to an account. Find your account and log in."));
    }
}
