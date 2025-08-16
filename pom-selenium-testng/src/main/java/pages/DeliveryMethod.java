package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WaitHelper;

import java.time.Duration;

public class DeliveryMethod {
    WebDriver driver;
    private WaitHelper wait;
    WebDriverWait wait_ = new WebDriverWait(driver, Duration.ofSeconds(10));

    //constructor
    public DeliveryMethod(WebDriver driver)
    {
        this.driver = driver;
        this.wait = new WaitHelper(driver, 10);
    }

    //elementos
    By comments = By.cssSelector("#collapse-shipping-method > div > p:nth-child(5) > textarea");
    //Botones
    By btn_continuar = By.cssSelector("#button-shipping-method");

    //acciones
    public void enter_Comments(String Comentarios) {
        wait.waitForVisibility(comments).sendKeys(Comentarios);
        //firstName.findElement(driver).sendKeys(Nombre);
    }
    public void btn_Continuar() {
         driver.findElement(btn_continuar).click();
        //wait.waitForClickable(btn_continuar).click();
    }

}
