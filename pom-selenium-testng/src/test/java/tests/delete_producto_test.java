package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.Delete_product;
import pages.Search_and_add;
import utils.BaseTest;

import java.time.Duration;

public class delete_producto_test extends BaseTest {
    Delete_product obj_carrito;

    @Test
    public void test_realizar_busqueda()
    {
        obj_carrito= new Delete_product(driver);

        System.out.println("Ver productos del carrito");
        obj_carrito.Ver_Carrito();



        WebElement opcion = driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[1]/table/tbody/tr[1]/td[2]/a[text()='MacBook Pro']"));
        System.out.println("Seleccionado: " + opcion.getText());

        //eliminar el producto
        //obj_carrito.Elimminar_Producto();

        By producto = By.xpath("//*[@id=\"cart\"]/ul/li[1]/table/tbody/tr[1]/td[5]/button");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement elemento = wait.until(
                ExpectedConditions.elementToBeClickable(producto)
        );
        elemento.click();

        //esperar a que desaparezca
        // Esperar a que desaparezca del carrito
         wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(producto));


        //opcion.click();
//*[@id="cart"]/ul/li[1]/table/tbody/tr[1]/td[2]/a
        //obj_carrito.Elimminar_Producto();



    }
}
