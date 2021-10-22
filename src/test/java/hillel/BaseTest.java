package hillel;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;


/**
 * @author Anastasiia Chaika
 */
public class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait wait;
    @BeforeTest
    public void beforeClass(){
        WebDriverManager.chromedriver().setup();
        this.driver = DriverSingleton.getDriver();
        wait = new WebDriverWait(driver, 10);

    }
   @AfterTest(alwaysRun = true)
    public void afterClass(){

        driver.quit();
    }
    @AfterMethod
    public void takeScreenshot(ITestResult result) throws IOException {
        if (!result.isSuccess()){
           File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
           saveScreenshot(Files.readAllBytes(screenshot.toPath()));
        }
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshot(byte[] screenShot) {
        return screenShot;
    }
}
