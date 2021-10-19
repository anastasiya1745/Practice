package hillel;

import hillel.PageObject.MainPage;
import org.testng.annotations.Test;

public class testPOHW21 extends BaseTest{


    @Test
    public void showUsername()  {
        MainPage mainPage = new MainPage(driver);
        mainPage.openApp().toNavHoverPage().Username1().Username2().Username3();


    }
    @Test
    public void readGeolocationValue(){
        MainPage mainPage = new MainPage(driver);
        mainPage.openApp().toNavGeoLocationPage().clickOnButton().readValues();
    }
    @Test
    public void postiveLogin(){
        MainPage mainPage = new MainPage(driver);
        mainPage.openApp().toNavLoginPage()
                .setUsername("tomsmith")
                .setPassword("SuperSecretPassword!")
                .clickOnSubmit()
                .readMsgPostiveLogin("You logged into a secure area! ")
                .clickOnLogout();
    }
    @Test
    public void negativeLogin(){
        MainPage mainPage = new MainPage(driver);
        mainPage.openApp()
                .toNavLoginPage()
                .setUsername("ffj")
                .setPassword("sfsj!")
                .clickOnSubmit()
                .readMsgNegativeLogin("Your username is invalid!");

    }
    @Test
    public void challengeDom(){
        MainPage mainPage = new MainPage(driver);
        mainPage.openApp()
                .toNavсhallengeDomPage()
                .clickButton1()
                .clickButton2()
                .clickButton3()
                .readShowColumn();

    }

}
