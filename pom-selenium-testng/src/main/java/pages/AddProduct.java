package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseTest;
import utils.WaitHelper;

import java.time.Duration;

public class AddProduct {
    WebDriver driver;
    private WaitHelper wait;
    //constructor
    public AddProduct(WebDriver driver) {
        this.driver = driver;
        this.wait = new WaitHelper(driver, 10);
    }

    //elementos
    By btn_add_car = By.cssSelector("#content > div:nth-child(7) > div:nth-child(4) > div > div:nth-child(2) > div.button-group > button:nth-child(1)");

    //Accciones
    public void Btn_agregar_Carrito() {

        System.out.println("Ruta de donde estoy "+driver.getCurrentUrl());
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0, 1000)", "");
        wait.waitForVisibility(btn_add_car).click();


    }

}
