package tests;

import org.testng.annotations.Test;
import pages.DeliveryMethod;
import utils.BaseTest;

public class delivery_metohd_test extends BaseTest {

    DeliveryMethod obj_delivery;

    @Test
    public void test_delivery_metohd()
    {
        obj_delivery = new DeliveryMethod(driver);

        obj_delivery.enter_Comments("Este es un ejemplo de comentarios");
        obj_delivery.btn_Continuar();
    }
}
