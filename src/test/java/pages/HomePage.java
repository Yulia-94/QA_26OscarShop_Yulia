package pages;

import com.sun.corba.se.impl.encoding.CDRInputObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "dropdown-submenu")
    WebElement submenuBooks;


    @FindBy(className = "product_pod")
    List<WebElement> productlist;


    public void selectCategory() {
        submenuBooks.click();
    }

    public void selectProduct() {
        productlist.get(0).click();
    }
}
