package hillel.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HoverPage extends BasePage {



    public HoverPage(WebDriver driver){
        super(driver);
    }
    public void AdditionalInfo()  {



        action.moveToElement(driver.findElement(By.xpath("//div[@class='figure'][1]"))).perform();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h5[contains(text(),'user1')]"))).getText().contains("name: user1");
        action.moveToElement(driver.findElement(By.xpath("//div[@class='figure'][2]"))).perform();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h5[contains(text(),'user2')]"))).getText().contains("name: user2");
        action.moveToElement(driver.findElement(By.xpath("//div[@class='figure'][3]"))).perform();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h5[contains(text(),'user3')]"))).getText().contains("name: user3");


    }
}
