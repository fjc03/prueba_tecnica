package utils;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class BaseTest {

    protected static WebDriver driver;

    @BeforeSuite
    public void setUpSuite() {
        //Configurar el driver de chrome

        //System.out.printf("Hello and welcome!");
        //Configurar la ruta del ChromeDriver
        String ruta = "/Users/odm/Downloads/chromedriver-mac-x64/chromedriver";


        System.setProperty("webdriver.chrome.driver",ruta);
        //crear una instancia de chrome driver
        driver = new ChromeDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }

    //Metodos
    //Esperar hasta que sea visible el elemento
    public void wait_element_visibility(WebDriver driver, String selector, int tiempo)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(tiempo));
        WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(selector)));
        btn.click();
    }

    @AfterSuite
    public void tearDownSuite() {
        if(driver !=null)
        {
            System.out.println("Se cierra el navegador");
            // driver.quit();
        }
    }
}