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



}
