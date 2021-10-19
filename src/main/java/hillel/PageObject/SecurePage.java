package hillel.PageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecurePage extends BasePage{

    public SecurePage(WebDriver driver){
        super(driver);
    }


    @Step("Read success message")
    public SecurePage readMsgPostiveLogin(String message){
        driver.findElement(By.xpath("//div[@class='flash success']")).getText().contains(message);
        return this;
    }
    @Step("Read error message")
    public void readMsgNegativeLogin(String message){
        driver.findElement(By.xpath("//div[@class='flash error']")).getText().contains(message);

    }
    @Step("Click on Logout")
    public void clickOnLogout(){
        driver.findElement(By.xpath("//i[@class='icon-2x icon-signout']")).click();

    }
}
