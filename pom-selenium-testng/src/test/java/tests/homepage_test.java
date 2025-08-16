package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.BaseTest;

import static org.testng.Assert.assertEquals;

public class homepage_test extends BaseTest {

    @Test
    public void loginValido() {
        //Navegar a la pagina deseada
        driver.get("https://opencart.abstracta.us");
        //Obtener el titulo
        String titulo = driver.getTitle();
        //Verificamos que el titulo sea google con Assert
        System.out.println("Titulo de la pagina: "+titulo);
        // assertEquals("Contact Form", titulo);
        //Dar clic en botones de error de privacidad para ingresar a la pagina
        WebElement elemento = driver.findElement(By.cssSelector("#details-button"));
        elemento.click();
        //Esperamos hasta que el elemento este visible y damos clic
        wait_element_visibility(driver,"#proceed-link",5);
        //enlace.click();
        //Obtenemos el titulo
        titulo = driver.getTitle();
        System.out.println("1. Titulo de la pagina: "+titulo);
        //Verificar el titulo de la pagina
        assertEquals("Your Store", titulo);
    }
}