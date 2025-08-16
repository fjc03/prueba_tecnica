package tests;

import org.testng.annotations.Test;
import pages.ViewProducts;
import utils.BaseTest;

public class viewProducts_test extends BaseTest {

    ViewProducts obj_prodcutos;

    @Test
    public void test_ver_productos()
    {
        obj_prodcutos = new ViewProducts(driver);

        obj_prodcutos.btn_menu();
        obj_prodcutos.Btn_sub_menu();
        //Navegar hasta la lista de productos laptop
        System.out.println("3. Lista los produtos");
    }

}
