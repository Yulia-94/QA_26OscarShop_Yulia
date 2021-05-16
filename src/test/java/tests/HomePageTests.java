package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.PageBase;
import pages.ProductPage;

import java.awt.print.PageFormat;

public class HomePageTests extends TestBase{
    HomePage homePage;
    ProductPage productPage;

    @BeforeMethod
    public void pageInit(){
        homePage = PageFactory.initElements(driver, HomePage.class);
        productPage = PageFactory.initElements(driver, ProductPage.class);
    }
    @Test
    public void userCanSelectProductInMenuTest(){
        homePage.selectCategory();
        homePage.selectProduct();
        Assert.assertTrue(productPage.isItProductPage());

    }
}
