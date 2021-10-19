package hillel.PageObject;

import io.qameta.allure.Step;
import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HoverPage extends BasePage {



    public HoverPage(WebDriver driver){
        super(driver);
    }

    @Step("Get name of user 1")
    public HoverPage Username1()  {

        action.moveToElement(driver.findElement(By.xpath("//div[@class='figure'][1]"))).perform();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h5[contains(text(),'user1')]"))).getText().contains("name: user1");
        return this;
    }
    @Step("Get name of user 2")
    public HoverPage Username2()  {

        action.moveToElement(driver.findElement(By.xpath("//div[@class='figure'][2]"))).perform();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h5[contains(text(),'user2')]"))).getText().contains("name: user2");
    return this;
    }
    @Step("Get name of user 3")
    public HoverPage Username3()  {

        action.moveToElement(driver.findElement(By.xpath("//div[@class='figure'][3]"))).perform();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h5[contains(text(),'user3')]"))).getText().contains("name: user3");

        return this;
    }
}

