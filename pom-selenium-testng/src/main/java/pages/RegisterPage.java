package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    WebDriver driver;

    By firstName = By.cssSelector("#input-firstname");
    By last_name = By.cssSelector("#input-lastname");
    By email  = By.cssSelector("#input-email");
    By telephone = By.cssSelector("#input-telephone");
    By password = By.cssSelector("#input-password");
    By confirm_password = By.cssSelector("#input-confirm");

    //Botones
    By aviso_privacidad = By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)");
    By btn_aceptar = By.cssSelector("#content > form > div > div > input.btn.btn-primary");


    //constructor
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    //Campos
    public void enterFirtName(String Nombre) {
        driver.findElement(firstName).sendKeys(Nombre);
    }

    public void enter_lastName(String apellido) {
        driver.findElement(last_name).sendKeys(apellido);
    }

    public void enter_email(String correo) {
        driver.findElement(email).sendKeys(correo);
    }

    public void enter_telephone(String telefono) {
        driver.findElement(telephone).sendKeys(telefono);
    }

    public void enter_password(String contraseña) {
        driver.findElement(password).sendKeys(contraseña);
    }

    public void enter_c_contraseña(String confirmar_pwd) {
        driver.findElement(confirm_password).sendKeys(confirmar_pwd);
    }

    public void btn_aviso_privacidad() {
        driver.findElement(aviso_privacidad).click();
    }

    public void btn_aceptar() {
        driver.findElement(btn_aceptar).click();
    }
}
