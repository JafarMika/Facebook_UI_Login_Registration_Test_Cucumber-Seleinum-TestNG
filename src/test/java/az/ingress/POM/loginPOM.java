package az.ingress.POM;

import org.openqa.selenium.By;

public class loginPOM {


    public final static By createNewAccountBtn =By.cssSelector("a[data-testid='open-registration-form-button']");
    public final static By username =By.name("email");
    public final static By password =By.id("pass");
    public final static By loginBtn =By.name("login");
    public final static By errorMsj =By.cssSelector("div[class=_9ay7]");
    public final static By Msj =By.xpath("(//*[contains(@class, 'x78zum5') and contains(@class, 'x1n2onr6')])[15]");

}
