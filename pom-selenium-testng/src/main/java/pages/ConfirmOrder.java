package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WaitHelper;

import java.time.Duration;

public class ConfirmOrder {

    WebDriver driver;
    private WaitHelper wait;
    WebDriverWait wait_ = new WebDriverWait(driver, Duration.ofSeconds(10));

    //constructor
    public ConfirmOrder(WebDriver driver)
    {
        this.driver = driver;
        this.wait = new WaitHelper(driver, 10);
    }

    //elementos
    By btn_continuar = By.cssSelector("#button-confirm");

    //Acciones
    public void btn_Continuar() {
        //driver.findElement(btn_continuar).click();
        wait.waitForClickable(btn_continuar).click();
    }

}
