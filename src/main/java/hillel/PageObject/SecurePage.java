package hillel.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecurePage extends BasePage{

    public SecurePage(WebDriver driver){
        super(driver);
    }
    public SecurePage readMsgPostiveLogin(String message){
        driver.findElement(By.xpath("//div[@class='flash success']")).getText().contains(message);
        return this;
    }
    public void readMsgNegativeLogin(String message){
        driver.findElement(By.xpath("//div[@class='flash error']")).getText().contains(message);

    }
    public void clickOnLogout(){
        driver.findElement(By.xpath("//i[@class='icon-2x icon-signout']")).click();

    }
}
