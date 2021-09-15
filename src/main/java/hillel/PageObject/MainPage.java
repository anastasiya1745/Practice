package hillel.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BasePage  {

    public MainPage(WebDriver driver) {
        super(driver);
    }


    public HoverPage toNavHoverPage(){
        driver.findElement(By.linkText("Hovers")).click();
        return new HoverPage(driver);
    }
    public GeoLocationPage toNavGeoLocationPage(){
        driver.findElement(By.linkText("Geolocation")).click();
        return new GeoLocationPage(driver);
    }
    public LoginPage toNavLoginPage(){
        driver.findElement(By.linkText("Form Authentication")).click();
        return new LoginPage(driver);
    }
    public ChallengeDomPage toNavсhallengeDomPage(){
        driver.findElement(By.linkText("Challenging DOM")).click();
        return new ChallengeDomPage(driver);
    }




}
