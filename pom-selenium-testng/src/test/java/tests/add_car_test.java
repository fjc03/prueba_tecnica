package tests;


import org.testng.annotations.Test;
import pages.AddProduct;
import utils.BaseTest;

public class add_car_test extends BaseTest {

    AddProduct obj_agregar;

    @Test
    public void test_agregar_producto()
    {
        obj_agregar= new AddProduct(driver);
        //obj_añadir.scrollHastaElemento(driver);
        System.out.println("4. "+driver.getTitle());
        obj_agregar.Btn_agregar_Carrito();
    }
}