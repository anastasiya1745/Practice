package hillel.pageObjectFile;

import hillel.PageObject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class downloadFile extends BasePage {

    public downloadFile(WebDriver driver){
        super(driver);
    }
    public downloadFile actionDownload() throws InterruptedException {
    driver.get("https://the-internet.herokuapp.com/download");
        driver.findElement(By.linkText("loremipsum.txt")).click();
        Thread.sleep(1000);
        System.out.println("downloading the file is done");
        return this;
}}
