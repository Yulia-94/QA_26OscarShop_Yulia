package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ProductPage;
import pages.RegisterPage;

public class RegisterPageTests extends TestBase{

    RegisterPage registerPage;
    ProductPage productPage;

    @BeforeMethod
    public void pageInit(){
        registerPage = PageFactory.initElements(driver, RegisterPage.class);
        productPage = PageFactory.initElements(driver, ProductPage.class);

    }
    @Test
    public void userCanRegisterPositiveTest() throws InterruptedException {
        registerPage.clickLoginorRegisterButton();
        registerPage.inputInEmailAddress();
        registerPage.inputInPassword();
        registerPage.inputInConfirmPassword();
        registerPage.clickRegisterButton();
        Thread.sleep(5000);
        Assert.assertTrue(productPage.isItMessageProductPage());
    }

    @Test
    public void registerWithNotValidEmailNegativeTest() throws InterruptedException {
        registerPage.clickLoginorRegisterButton();
        registerPage.inputInEmailAddressNotValid();
        registerPage.inputInPassword();
        registerPage.inputInConfirmPassword();
        registerPage.clickRegisterButton();
        Thread.sleep(5000);
        Assert.assertTrue(registerPage.errorMessage());
    }

    @Test
    public void registerWithNotValidPasswordNegativeTest() throws InterruptedException {
        registerPage.clickLoginorRegisterButton();
        registerPage.inputInEmailAddress();
        registerPage.inputInPasswordNotValid();
        registerPage.inputInConfirmPasswordNotValid();
        registerPage.clickRegisterButton();
        Thread.sleep(5000);
        Assert.assertTrue(registerPage.errorMessage());
    }

    @Test
    public void registerWithNotValidConfirmPasswordNegativeTest() throws InterruptedException {
        registerPage.clickLoginorRegisterButton();
        registerPage.inputInEmailAddress();
        registerPage.inputInPassword();
        registerPage.inputInConfirmPasswordNotValid();
        registerPage.clickRegisterButton();
        Thread.sleep(5000);
        Assert.assertTrue(registerPage.errorMessage());
    }
    @Test
    public void registerWithTwoAccountsNegativeTest() throws InterruptedException {
        registerPage.clickLoginorRegisterButton();
        registerPage.inputInEmailAddressAlreadyExists();
        registerPage.inputInPassword();
        registerPage.inputInConfirmPassword();
        registerPage.clickRegisterButton();
        Thread.sleep(5000);
        Assert.assertTrue(registerPage.errorMessage());
    }
}
