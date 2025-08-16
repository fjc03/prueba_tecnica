package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitHelper;

public class Checkout_options {
    WebDriver driver;
    private WaitHelper wait;

    //constructor
    public Checkout_options(WebDriver driver)
    {
        this.driver = driver;
        this.wait = new WaitHelper(driver, 10);
    }

    //elementos
    By btn_custumer = By.xpath("//*[@id=\"collapse-checkout-option\"]/div/div/div[1]/div[2]/label");
    By btn_continuar = By.xpath("//*[@id=\"button-account\"]");
    //acciones

    public void Btn_Customer() {
        // driver.findElement(bnt_menu).click();
        wait.waitForVisibility(btn_custumer).click();
    }
    public void Btn_Continuar() {
        // driver.findElement(bnt_menu).click();
        wait.waitForVisibility(btn_continuar).click();
    }

}
