package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WaitHelper;

import java.time.Duration;

public class ForgotPassword {

    WebDriver driver;
    private WaitHelper wait;
    WebDriverWait wait_ = new WebDriverWait(driver, Duration.ofSeconds(10));

    //constructor
    public ForgotPassword(WebDriver driver)
    {
        this.driver = driver;
        this.wait = new WaitHelper(driver, 10);
    }

    //elementos
    By email = By.cssSelector("#collapse-payment-method > div > p:nth-child(5) > textarea");
    //Botones
    By btn_continuar = By.cssSelector("#collapse-payment-method > div > div.buttons > div > input[type=checkbox]:nth-child(2)");
    By btn_myaccount = By.cssSelector("#top-links > ul > li.dropdown > a");
    By btn_register = By.cssSelector("#top-links > ul > li.dropdown.open > ul > li:nth-child(1) > a");
    By btn_forgotten = By.cssSelector("#column-right > div > a:nth-child(3)");

    public void btn_MyAccount() {
       // driver.findElement(btn_myaccount).click();
        wait.waitForClickable(btn_continuar).click();
    }
    public void btn_Register() {
        //driver.findElement(btn_register).click();
        wait.waitForClickable(btn_continuar).click();
    }

    public void btn_Forgotten() {
        //driver.findElement(btn_forgotten).click();
        wait.waitForClickable(btn_forgotten).click();
    }

}
