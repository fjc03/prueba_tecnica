package tests;

import org.testng.annotations.Test;
import pages.Checkout_options;
import utils.BaseTest;

public class checkout_options_test extends BaseTest {

    Checkout_options obj_options;

    @Test
    public void test_chekout_options()
    {
        obj_options = new Checkout_options(driver);

        obj_options.Btn_Customer();
        obj_options.Btn_Continuar();
    }
}
