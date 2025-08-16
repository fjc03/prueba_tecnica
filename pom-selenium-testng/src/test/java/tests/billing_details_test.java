package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.Billing_Details;
import utils.BaseTest;

import java.time.Duration;
import java.time.Instant;

public class billing_details_test extends BaseTest {
    Billing_Details obj_billing;

    @Test
    public void billl_details_test()
    {
        obj_billing = new Billing_Details(driver);

        obj_billing.enter_FirstName("Juan");
        obj_billing.enter_LasttName("Perez");
        obj_billing.enter_Email("p6@yopmail.com");
        obj_billing.enter_Telephone("1234567890");
        //obj_billing.enter_Company("Compañia de prueba");
        obj_billing.enter_Addres("Calle de prueba");
        obj_billing.enter_City("Guanajuato");
        obj_billing.enter_PostCode("12345");
        obj_billing.enter_Country("Albania");

       //Cargamos una opcion del las mostradas
        obj_billing.enter_Region(49);

        //hacer un scroll para poder darle clic al boton
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0, 200)", "");
        obj_billing.btn_Continuar();


    }

}
