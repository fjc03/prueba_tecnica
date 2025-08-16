package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitHelper;

public class Search_and_add {
    WebDriver driver;
    private WaitHelper wait;
    //constructor
    public Search_and_add(WebDriver driver) {
        this.driver = driver;
        this.wait = new WaitHelper(driver, 10);
    }

    //elementos
    By search_text = By.cssSelector("#search > input");
    By btn_buscar = By.cssSelector("#search > span > button");
    By btn_agregar_carrito = By.cssSelector("#content > div:nth-child(8) > div > div > div:nth-child(2) > div.button-group > button:nth-child(1)");

    //Acciones
    //Campos
    public void EnterSearch_field(String busqueda) {
        driver.findElement(search_text).sendKeys(busqueda);
    }

    public void Btn_Buscar() {
        driver.findElement(btn_buscar).click();
    }

    public void Btn_Agregar_Carrito() {
        driver.findElement(btn_agregar_carrito).click();
    }


}
