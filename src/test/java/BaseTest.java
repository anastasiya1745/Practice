import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


/**
 * @author Anastasiia Chaika
 */
public class BaseTest {
    protected WebDriver driver = new ChromeDriver();

    @BeforeClass
    public void beforeClass(){
      WebDriverManager.chromedriver().setup();
    }
   @AfterClass
    public void afterClass(){driver.quit();}

}
