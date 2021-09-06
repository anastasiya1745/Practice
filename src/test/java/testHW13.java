import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import javax.swing.*;

public class testHW13 extends BaseTest{
    @Test
            public void dropped() throws InterruptedException {
        driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");

        Actions action = new Actions(driver);

        WebElement a = driver.findElement(By.cssSelector("div.ui-draggable"));
        WebElement b = driver.findElement(By.cssSelector("div.ui-droppable"));
        action.dragAndDrop(a,b).perform();

        driver.findElement(By.cssSelector("div.ui-droppable p")).getText().trim().equals("Dropped!");
    }

    @Test
    public void dropMenu() throws InterruptedException {
        driver.get("https://crossbrowsertesting.github.io/hover-menu.html");

        Actions action = new Actions(driver);

        action.moveToElement(driver.findElement(By.cssSelector("span.caret"))).perform();
        action.moveToElement(driver.findElement(By.cssSelector("span.glyphicon-triangle-right"))).perform();
        driver.findElement(By.cssSelector("ul.secondary a")).click();
        driver.findElement(By.cssSelector("div.secondary-clicked")).getText().trim().equals("Secondary Page");

    }
    @Test
    public void username() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/hovers");

        Actions action = new Actions(driver);

        action.moveToElement(driver.findElement(By.xpath("//div[@class='figure'][1]"))).perform();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h5[contains(text(),'user1')]"))).getText().contains("name: user1");
        action.moveToElement(driver.findElement(By.xpath("//div[@class='figure'][2]"))).perform();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h5[contains(text(),'user2')]"))).getText().contains("name: user2");
        action.moveToElement(driver.findElement(By.xpath("//div[@class='figure'][3]"))).perform();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h5[contains(text(),'user3')]"))).getText().contains("name: user3");

    }

}