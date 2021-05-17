package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends PageBase{
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "login_link")
    WebElement register;

    public void clickLoginorRegisterButton() {
        register.click();


    }
    @FindBy(id = "id_registration-email")
    WebElement emailName;

    public void inputInEmailAddress() {
        emailName.click();
        emailName.clear();
        emailName.sendKeys("yulia"+System.currentTimeMillis()+"@gmail.com");
    }

    @FindBy(id="id_registration-password1")
    WebElement passwordName;

    public void inputInPassword() {
        passwordName.click();
        passwordName.clear();
        passwordName.sendKeys("1234567Rr");
    }


    @FindBy(id="id_registration-password2")
    WebElement confPasswordName;
    
    public void inputInConfirmPassword() {
      confPasswordName.click();
      confPasswordName.clear();
      confPasswordName.sendKeys("1234567Rr");
    }

    @FindBy(name = "registration_submit")
    WebElement registerButton;

    public void clickRegisterButton() {
        registerButton.click();
    }

    public void inputInEmailAddressNotValid() {
        emailName.click();
        emailName.clear();
        emailName.sendKeys("yulia878@gmail");
    }

    @FindBy(className = "error-block")
    WebElement error;

    public boolean errorMessage() {
        return error.isDisplayed();
    }

    public void inputInPasswordNotValid() {
        passwordName.click();
        passwordName.clear();
        passwordName.sendKeys("1234567");
    }

    public void inputInConfirmPasswordNotValid() {
        confPasswordName.click();
        confPasswordName.clear();
        confPasswordName.sendKeys("1234567");
    }

    public void inputInEmailAddressAlreadyExists() {
        emailName.click();
        emailName.clear();
        emailName.sendKeys("yulia878@gmail.com");
    }
}
