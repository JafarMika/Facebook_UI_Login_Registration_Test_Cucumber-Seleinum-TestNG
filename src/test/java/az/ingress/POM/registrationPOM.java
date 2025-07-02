package az.ingress.POM;

import org.openqa.selenium.By;

public class registrationPOM {
    public final static By newAccountBtn = By.xpath("//a[@href='/r.php?entry_point=login']");
    public final static By createNewAccountBtn =By.cssSelector("a[data-testid='open-registration-form-button']");
    public final static By firstName = By.name("firstname");
    public final static By lastName = By.name("lastname");
    public final static By email =By.name("reg_email__");
    public final static By password = By.name("reg_passwd__");
    public final static By birthdayDay = By.id("day");
    public final static By birthdayMonth = By.id("month");
    public final static By birthdayYear = By.id("year");
    public final static By genderFemale = By.xpath("//input[@value='1']");
    public final static By genderMale = By.xpath("//input[@value='2']");
    public final static By genderCustom = By.xpath("//input[@value='-1']");
    public final static By signUpBtn = By.name("websubmit");
    public final static By errorMsjReg = By.cssSelector("div[class='_5633 _5634 _53ij']");

}
