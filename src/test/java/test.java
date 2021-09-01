import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class test extends BaseTest {
        @Test
    public void test1() {
            driver.get("https://the-internet.herokuapp.com/challenging_dom");
            WebElement button1 = driver.findElement(By.xpath("//a[@class='button']"));
            button1.click();
            WebElement button2 = driver.findElement(By.xpath("//a[@class='button alert']"));
            button2.click();
            WebElement button3 = driver.findElement(By.xpath("//a[@class='button success']"));
            button3.click();
            driver.close();
        }

}