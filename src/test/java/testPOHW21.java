import hillel.PageObject.HoverPage;
import hillel.PageObject.MainPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class testPOHW21 extends BaseTest{


    @Test
    public void test1()  {
        driver.get("https://the-internet.herokuapp.com");
        MainPage mainPage = new MainPage(driver);
        mainPage.toNavHoverPage().AdditionalInfo();



    }


}
