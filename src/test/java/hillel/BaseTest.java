package hillel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


/**
 * @author Anastasiia Chaika
 */
public class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait wait;
    @BeforeClass
    public void beforeClass(){
        WebDriverManager.chromedriver().setup();
        this.driver = DriverSingleton.getDriver();
        wait = new WebDriverWait(driver, 10);

    }
   @AfterClass(alwaysRun = true)
    public void afterClass(){


        driver.quit();
    }

}
