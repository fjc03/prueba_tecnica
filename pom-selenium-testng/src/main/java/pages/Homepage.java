package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {

    private WebDriver driver;

    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton   = By.cssSelector("button[type='submit']");

    public Homepage(WebDriver driver) {
        this.driver = driver;
    }

    public Homepage enterUsername(String username) {
        driver.findElement(usernameField).clear();
        driver.findElement(usernameField).sendKeys(username);
        return this;
    }

    public Homepage enterPassword(String password) {
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
}