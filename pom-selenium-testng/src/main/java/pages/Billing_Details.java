package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WaitHelper;

import java.time.Duration;

public class Billing_Details {
    WebDriver driver;
    private WaitHelper wait;
    WebDriverWait wait_ = new WebDriverWait(driver, Duration.ofSeconds(10));

    //constructor
    public Billing_Details(WebDriver driver)
    {
        this.driver = driver;
        this.wait = new WaitHelper(driver, 10);
    }

    //elementos
    By firstName = By.cssSelector("#input-payment-firstname");
    By last_name = By.cssSelector("#input-payment-lastname");
    By email  = By.cssSelector("#input-payment-email");
    By telephone = By.cssSelector("#input-payment-telephone");
    By company = By.cssSelector("##input-payment-company");
    By addres_1 = By.cssSelector("#input-payment-address-1");
    By city = By.cssSelector("#input-payment-city");
    By post_code = By.cssSelector("#input-payment-postcode");
    By country  = By.cssSelector("#input-payment-country");
    By region = By.cssSelector("#input-payment-zone");

    //Botones
    By btn_continuar = By.cssSelector("#button-guest");

    //acciones
    public void enter_FirstName(String Nombre) {
        wait.waitForVisibility(firstName).sendKeys(Nombre);
    //firstName.findElement(driver).sendKeys(Nombre);
    }

    public void enter_LasttName(String Apellido) {
        wait.waitForVisibility(last_name).sendKeys(Apellido);
    }

    public void enter_Email(String Correo) {
        wait.waitForVisibility(email).sendKeys(Correo);
    }

    public void enter_Telephone(String Telefono) {
        wait.waitForVisibility(telephone).sendKeys(Telefono);
    }

    public void enter_Company(String Compania) {
        wait.waitForVisibility(company).sendKeys(Compania);
    }

    public void enter_Addres(String Direccion) {
        wait.waitForVisibility(addres_1).sendKeys(Direccion);
    }

    public void enter_City(String Ciudad) {
        driver.findElement(city).sendKeys(Ciudad);
    }

    public void enter_PostCode(String CodigoPostal) {
        driver.findElement(post_code).sendKeys(CodigoPostal);
    }

    public void enter_Country(String Pais) {
        // Seleccionar país
        Select paisSelect = new Select(driver.findElement(country));
        //paisSelect.selectByValue(Pais);
        paisSelect.selectByVisibleText(Pais);
    }

    public void enter_Region(int Region) {

        //esperamos hasta que opcion este visible
        wait_.until(driver1 -> {
            Select ciudadSelect = new Select(driver.findElement(region));
            return ciudadSelect.getOptions().size() > 1; // más de una opción cargada
        });

        // Seleccionar país
        Select regionSelect = new Select(driver.findElement(region));
        regionSelect.selectByValue(String.valueOf(Region));


    }

    public void btn_Continuar() {
       // driver.findElement(btn_continuar).click();
        wait.waitForClickable(btn_continuar).click();
    }


}
