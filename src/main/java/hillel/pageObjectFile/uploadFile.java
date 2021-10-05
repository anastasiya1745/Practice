package hillel.pageObjectFile;

import hillel.PageObject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;

public class uploadFile extends BasePage {

    public uploadFile(WebDriver driver){
        super(driver);
    }
    public uploadFile uploadAction() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement inputFile = driver.findElement(By.xpath("//input[@id='file-upload']"));
        inputFile.sendKeys(new File("C:\\Users\\achaika\\IdeaProjects\\Practice\\target\\loremipsum.txt").getAbsolutePath());
        driver.findElement(By.cssSelector("input.button")).click();
        String a = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.panel"))).getText();
        Thread.sleep(1000);
        System.out.println("upload " + a + " done");
        return this;
    }
}
