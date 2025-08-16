package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.AddNewProduct;
import utils.BaseTest;

import java.util.concurrent.TimeUnit;

public class add_new_product_test extends BaseTest {

    AddNewProduct obj_nuevo_producto;

    @Test
    public void agrega_nuevo_producto()
    {
        obj_nuevo_producto = new AddNewProduct(driver);
        //hacemos un scroll
        //WebElement header = driver.findElement(By.id("header")); // o algún div fuera del dropdown
        //header.click();

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0, 650)", "");

        //agregar el nuevo producto
        obj_nuevo_producto.Btn_Agregar_Producto();
        //esperar
        //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
     @Test
    public void ver_productos_carrito()
     {
         //doy clic en el menu
         System.out.println("Ir a pagar");
         obj_nuevo_producto.Btn_Menu();
     }

}
