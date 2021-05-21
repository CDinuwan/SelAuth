package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By usernameFiled=By.id("username");
    private By password=By.id("password");
    private By loginButton=By.cssSelector("#login button");

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    public void setUsername(String username){
        driver.findElement(usernameFiled).sendKeys(username);
    }
    public void setPassword(String password){
        driver.findElement(usernameFiled).sendKeys(password);
    }

    public SecureAreaPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }
}