package hillel.PageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChallengeDomPage extends BasePage{

    public ChallengeDomPage(WebDriver driver){
        super(driver);
    }

    @Step("Click on button 1")
    public ChallengeDomPage clickButton1(){
        driver.findElement(By.xpath("//a[@class='button']")).click();
        return this;
    }
    @Step("Click on button 2")
    public ChallengeDomPage clickButton2(){
        driver.findElement(By.xpath("//a[@class='button alert']")).click();
        return this;
    }
    @Step("Click on button 3")
    public ChallengeDomPage clickButton3(){
        driver.findElement(By.xpath("//a[@class='button success']")).click();
        return this;
    }
    public void readShowColumn(){
        System.out.println(driver.findElement(By.xpath("//tr[1]/td[4]")).getText());
        System.out.println(driver.findElement(By.xpath("//tr[2]/td[4]")).getText());
        System.out.println(driver.findElement(By.xpath("//tr[3]/td[4]")).getText());
        System.out.println(driver.findElement(By.xpath("//tr[4]/td[4]")).getText());
        System.out.println(driver.findElement(By.xpath("//tr[5]/td[4]")).getText());
        System.out.println(driver.findElement(By.xpath("//tr[6]/td[4]")).getText());
        System.out.println(driver.findElement(By.xpath("//tr[7]/td[4]")).getText());
        System.out.println(driver.findElement(By.xpath("//tr[8]/td[4]")).getText());
        System.out.println(driver.findElement(By.xpath("//tr[9]/td[4]")).getText());
        System.out.println(driver.findElement(By.xpath("//tr[10]/td[4]")).getText());
    }
}
