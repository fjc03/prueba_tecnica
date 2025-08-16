package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.RegisterPage;
import utils.BaseTest;

public class registerPage_test extends BaseTest {

    RegisterPage obj_registrar;

    @Test
    public void continuarRegistro() {

        //Cremos objeto y le enviamos el driver donde nos quedamos

        obj_registrar = new RegisterPage(driver);
        System.out.println("URL actual: " + driver.getCurrentUrl());
        //esperar que el elemento sea visible y dar click
        wait_element_visibility(driver,"#top-links > ul > li.dropdown > a",5);
        //Dar clic en la opcion de registrar
        driver.findElement(By.cssSelector("#top-links > ul > li.dropdown.open > ul > li:nth-child(1) > a")).click();
        //Completar los datos
        obj_registrar.enterFirtName("Juan");
        obj_registrar.enter_lastName("Perez");
        obj_registrar.enter_email("p6@yopmail.com");
        obj_registrar.enter_telephone("1234567890");
        obj_registrar.enter_password("12345Qwe.");
        obj_registrar.enter_c_contraseña("12345Qwe.");
        obj_registrar.btn_aviso_privacidad();
        obj_registrar.btn_aceptar();
        System.out.println("2. Se registra correctamente el usuario");

    }
}