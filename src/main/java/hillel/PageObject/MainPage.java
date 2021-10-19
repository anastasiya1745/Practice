package hillel.PageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BasePage  {



    public MainPage openApp(){
        driver.get("https://the-internet.herokuapp.com");
        return new MainPage(driver);
    }
    public MainPage(WebDriver driver) {

        super(driver);
    }

    @Step("Navigate to Hover Page")
    public HoverPage toNavHoverPage(){
        driver.findElement(By.linkText("Hovers")).click();
        return new HoverPage(driver);
    }
    @Step("Navigate to GeoLocation Page")
    public GeoLocationPage toNavGeoLocationPage(){
        driver.findElement(By.linkText("Geolocation")).click();
        return new GeoLocationPage(driver);
    }
    @Step("Navigate to Login Page")
    public LoginPage toNavLoginPage(){
        driver.findElement(By.linkText("Form Authentication")).click();
        return new LoginPage(driver);
    }
    @Step("Navigate to сhallengeDom Page")
    public ChallengeDomPage toNavсhallengeDomPage(){
        driver.findElement(By.linkText("Challenging DOM")).click();
        return new ChallengeDomPage(driver);
    }




}
