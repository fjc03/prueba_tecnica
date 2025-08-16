package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewProducts {

    WebDriver driver;
    //constructor
    public ViewProducts(WebDriver driver) {
        this.driver = driver;
    }

    //Botones
    By btn_menu = By.cssSelector("#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li:nth-child(2) > a");
    By btn_sub_menu = By.cssSelector("#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li.dropdown.open > div > a");

    //Accciones
    public void btn_menu() {
        driver.findElement(btn_menu).click();
    }
    public void Btn_sub_menu() {
        driver.findElement(btn_sub_menu).click();
    }

}
