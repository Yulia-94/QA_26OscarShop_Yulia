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

    public void enterEmail() {
        emailName.click();
        emailName.clear();
        emailName.sendKeys("yulia123@gmail.com");
    }

    @FindBy(id="id_registration-password1")
    WebElement passwordName;

    public void enterPassword() {
        passwordName.click();
        passwordName.clear();
        passwordName.sendKeys("12345678");
    }


    @FindBy(id="id_registration-password2")
    WebElement confPasswordName;
    
    public void enterConfirmPassword() {
      confPasswordName.click();
      confPasswordName.clear();
      confPasswordName.sendKeys("12345678");
    }

    @FindBy(className = "registration_submit")
    WebElement registerButton;

    public void clickRegisterButton() {
        registerButton.click();
    }
}
