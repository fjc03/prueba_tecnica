package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pages.Search_and_add;
import utils.BaseTest;

import java.lang.annotation.Target;

public class search_and_add_test extends BaseTest {

    Search_and_add obj_buscar;

    @Test
    public void test_realizar_busqueda()
    {
        obj_buscar= new Search_and_add(driver);
        obj_buscar.EnterSearch_field("Samsung Galaxy");
        obj_buscar.Btn_Buscar();

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0, 150)", "");

        obj_buscar.Btn_Agregar_Carrito();

    }
}
