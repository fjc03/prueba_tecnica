package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitHelper;

public class AddNewProduct {

    WebDriver driver;
    private WaitHelper wait;

    //constructor
    public AddNewProduct(WebDriver driver)
    {
        this.driver = driver;
        this.wait = new WaitHelper(driver, 10);
    }

    //elementos
    By bnt_menu = By.xpath("//*[@id=\"top-links\"]/ul/li[5]");
    By btn_agregar_producto = By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]");
    //acciones

    public void Btn_Menu() {
       // driver.findElement(bnt_menu).click();
        wait.waitForVisibility(bnt_menu).click();
    }

    public void Btn_Agregar_Producto() {
        driver.findElement(btn_agregar_producto).click();
    }


}
