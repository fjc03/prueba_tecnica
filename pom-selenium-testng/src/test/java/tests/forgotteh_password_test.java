package tests;

import org.testng.annotations.Test;
import pages.ForgotPassword;
import utils.BaseTest;

public class forgotteh_password_test extends BaseTest {
    ForgotPassword obj_password;

    @Test
    public void fogotten_password_test()
    {
        obj_password = new ForgotPassword(driver);
        //obj_password.btn_MyAccount();
        //obj_password.btn_Register();
        //obj_password.btn_Forgotten();
    }
}
