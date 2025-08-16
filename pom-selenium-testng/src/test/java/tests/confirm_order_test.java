package tests;

import org.testng.annotations.Test;
import pages.ConfirmOrder;
import utils.BaseTest;

public class confirm_order_test extends BaseTest {

    ConfirmOrder obj_confirm;

    @Test
    public void confirm_order_test()
    {
        obj_confirm = new ConfirmOrder(driver);
        obj_confirm.btn_Continuar();
    }
}
