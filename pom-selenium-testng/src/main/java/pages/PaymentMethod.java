package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WaitHelper;

import java.time.Duration;

public class PaymentMethod {

    WebDriver driver;
    private WaitHelper wait;
    WebDriverWait wait_ = new WebDriverWait(driver, Duration.ofSeconds(10));

    //constructor
    public PaymentMethod(WebDriver driver)
    {
        this.driver = driver;
        this.wait = new WaitHelper(driver, 10);
    }

    //elementos
    By comments = By.cssSelector("#collapse-payment-method > div > p:nth-child(5) > textarea");
    //Botones
    By check_terms = By.cssSelector("#collapse-payment-method > div > div.buttons > div > input[type=checkbox]:nth-child(2)");
    By btn_continuar = By.cssSelector("#button-payment-method");

    //acciones
    public void enter_Comments(String Comentarios) {
        wait.waitForVisibility(comments).sendKeys(Comentarios);
        //firstName.findElement(driver).sendKeys(Nombre);
    }
    public void btn_Terms() {
        driver.findElement(check_terms).click();
        //wait.waitForClickable(btn_continuar).click();
    }

    public void btn_Continuar() {
        driver.findElement(btn_continuar).click();
        //wait.waitForClickable(btn_continuar).click();
    }
}
