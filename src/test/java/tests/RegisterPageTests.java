package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
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
    public void userCanRegisterTest(){
        registerPage.clickLoginorRegisterButton();
        registerPage.enterEmail();
        registerPage.enterPassword();
        registerPage.enterConfirmPassword();
        registerPage.clickRegisterButton();
        Assert.assertTrue(productPage.isItMessageProductPage());



    }
}
