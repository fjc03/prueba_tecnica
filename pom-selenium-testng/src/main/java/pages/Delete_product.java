package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WaitHelper;

import java.time.Duration;

public class Delete_product {

    WebDriver driver;
    private WaitHelper wait;
    //constructor
    public Delete_product(WebDriver driver) {
        this.driver = driver;
        this.wait = new WaitHelper(driver, 10);
    }

    //elementos
    By btn_ver_carrito = By.cssSelector("#cart > button");
    By btn_eliminar_producto = By.xpath("//*[@id=\"cart\"]/ul/li[1]/table/tbody/tr[1]/td[5]/button");
    By btn_agregar_producto = By.cssSelector("#content > div:nth-child(8) > div > div > div:nth-child(2) > div.button-group > button:nth-child(1)");

    //acciones
    public void Ver_Carrito() {
        driver.findElement(btn_ver_carrito).click();
    }
    public void Elimminar_Producto() {
        //wait.waitForClickable(btn_eliminar_producto).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement elemento = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cart\"]/ul/li[1]/table/tbody/tr[1]/td[5]/button"))
        );
        elemento.click();
    }




    public void Agregar_producto() {
       // wait.waitForClickable(btn_agregar_producto).click();
        driver.findElement(btn_agregar_producto).click();
    }


}
