import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class testHW12 extends BaseTest {
            @Test
        public void test1() throws InterruptedException {
                driver.get("https://the-internet.herokuapp.com/challenging_dom");
                driver.findElement(By.xpath("//a[@class='button']")).click();
                driver.findElement(By.xpath("//a[@class='button alert']")).click();
                driver.findElement(By.xpath("//a[@class='button success']")).click();
                Thread.sleep(1000);
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

        @Test
        public void LoginPositive() {
                driver.get("https://the-internet.herokuapp.com/login ");
                driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
                driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
                driver.findElement(By.xpath("//button[@type='submit']")).click();
                driver.findElement(By.xpath("//div[@class='flash success']")).getText().contains("You logged into a secure area!");
                driver.findElement(By.xpath("//i[@class='icon-2x icon-signout']")).click();

        }
        @Test
        public void LoginNegative(){
                driver.get("https://the-internet.herokuapp.com/login ");
                driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ffj");
                driver.findElement(By.xpath("//input[@id='password']")).sendKeys("ggjy");
                driver.findElement(By.xpath("//button[@type='submit']")).click();
                driver.findElement(By.xpath("//div[@class='flash error']")).getText().contains("Your username is invalid!");

        }
        @Test
        public void geolocation() throws InterruptedException {
                driver.get("https://the-internet.herokuapp.com/geolocation");
                driver.findElement(By.cssSelector("div.example button")).click();
                Thread.sleep(1000);

                String a = driver.findElement(By.xpath("//div[@id='lat-value']")).getText();
                String b = driver.findElement(By.xpath("//div[@id='long-value']")).getText();
                System.out.println("Latitude: "+a);
                System.out.println("Longitude: "+b);


               }
}














