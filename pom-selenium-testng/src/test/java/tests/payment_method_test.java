package tests;

import org.testng.annotations.Test;
import pages.PaymentMethod;
import utils.BaseTest;

public class payment_method_test extends BaseTest {

    PaymentMethod obj_payment;

    @Test
    public void test_payment_method()
    {
        obj_payment = new PaymentMethod(driver);
        obj_payment.enter_Comments("Este es un comentario en payment method");
        obj_payment.btn_Terms();
        obj_payment.btn_Continuar();
    }
}
