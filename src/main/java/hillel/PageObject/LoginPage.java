package hillel.PageObject;


import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver){
        super(driver);
    }

    @Step ("Set username")
    public LoginPage setUsername(String username){
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
        return this;

    }
    @Step ("Set password")
    public LoginPage setPassword (String password){
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        return this;

    }
    @Step ("Click on Submit")
    public SecurePage clickOnSubmit(){
        driver.findElement(By.xpath("//button[@type='submit']")).click();
       return new SecurePage(driver);
    }



}
