import hillel.PageObject.HoverPage;
import hillel.PageObject.MainPage;
import hillel.PageObject.SecurePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testPOHW21 extends BaseTest{


    @Test
    public void showUsername()  {
        driver.get("https://the-internet.herokuapp.com");
        MainPage mainPage = new MainPage(driver);
        mainPage.toNavHoverPage().Username1().Username2().Username3();


    }
    @Test
    public void readGeolocationValue(){
        driver.get("https://the-internet.herokuapp.com");
        MainPage mainPage = new MainPage(driver);
        mainPage.toNavGeoLocationPage().clickOnButton().readValues();
    }
    @Test
    public void postiveLogin(){
        driver.get("https://the-internet.herokuapp.com");
        MainPage mainPage = new MainPage(driver);
        mainPage.toNavLoginPage()
                .setUsername("tomsmith")
                .setPassword("SuperSecretPassword!")
                .clickOnSubmit()
                .readMsgPostiveLogin("You logged into a secure area!")
                .clickOnLogout();
    }
    @Test
    public void negativeLogin(){
        driver.get("https://the-internet.herokuapp.com");
        MainPage mainPage = new MainPage(driver);
        mainPage.toNavLoginPage().setUsername("ffj").setPassword("sfsj!").clickOnSubmit().readMsgNegativeLogin("Your username is invalid!");

    }
    @Test
    public void challengeDom(){
        driver.get("https://the-internet.herokuapp.com");
        MainPage mainPage = new MainPage(driver);
        mainPage.toNavсhallengeDomPage().clickButton1().clickButton2().clickButton3().readShowColumn();

    }

}
