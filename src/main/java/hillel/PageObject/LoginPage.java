package hillel.PageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver){
        super(driver);
    }

    public LoginPage setUsername(String username){
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
        return this;

    }
    public LoginPage setPassword (String password){
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        return this;

    }
    public SecurePage clickOnSubmit(){
        driver.findElement(By.xpath("//button[@type='submit']")).click();
       return new SecurePage(driver);
    }



}
