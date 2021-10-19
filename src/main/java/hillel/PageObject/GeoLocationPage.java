package hillel.PageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GeoLocationPage extends BasePage {

    public GeoLocationPage(WebDriver driver){
        super(driver);
    }

    @Step("Click on button")
    public GeoLocationPage clickOnButton(){
        driver.findElement(By.cssSelector("div.example button")).click();
        return new GeoLocationPage(driver);
    }
    @Step("read latitude and longitude")
    public void readValues(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='map-link']")));
        String a = driver.findElement(By.xpath("//div[@id='lat-value']")).getText();
        String b = driver.findElement(By.xpath("//div[@id='long-value']")).getText();
        System.out.println("Latitude: "+a);
        System.out.println("Longitude: "+b);
    }


}
