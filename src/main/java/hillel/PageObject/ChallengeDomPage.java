package hillel.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChallengeDomPage extends BasePage{

    public ChallengeDomPage(WebDriver driver){
        super(driver);
    }

    public void clickButton1(){
        driver.findElement(By.xpath("//a[@class='button']")).click();
    }
    public void clickButton2(){
        driver.findElement(By.xpath("//a[@class='button alert']")).click();
    }
    public void clickButton3(){
        driver.findElement(By.xpath("//a[@class='button success']")).click();
    }
}
