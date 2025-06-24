package az.ingress.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static az.ingress.DriverUtils.DriverUtils.getDriver;
import static az.ingress.POM.loginPOM.password;
import static az.ingress.POM.loginPOM.username;
import static az.ingress.enums.ExpectedConditionsTypes.VISIBLE;


public class loginSteps extends BaseMethods{


    @Given("men facebook ana sehifresine gedirem")
    public void menFacebookAnaSehifresineGedirem() {
        getDriver().get("https://www.facebook.com/");

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
}
