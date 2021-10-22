package hillel.TestFreelance;

import hillel.BaseTest;
import hillel.finaProject.HomePageFreelance;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class testFreelanceFinal extends BaseTestFreelance{

    @Test
    public void aregisterUser(){
        open("https://freelance.lsrv.in.ua/home");
        HomePageFreelance homePageFreelance = new HomePageFreelance();
        homePageFreelance
                .toNavRegisterPageFreelance()
                .setInfo("birdbird","anastasiya","chaika","123456789","123456789")
                .signIn();
    }

    @Test
    public void bmodifyUserInfo(){
        open("https://freelance.lsrv.in.ua/home");
        HomePageFreelance homePageFreelance = new HomePageFreelance();
        homePageFreelance
                .toNavLoginPageFreelance()
                .inputUsername("birdbird")
                .inputPassword("123456789")
                .clickOnLogin()
                .clickOnProfile()
                .modifyInfo("anastasiya", "Okta")
                .assertAction("anastasiya Okta")
                .clickOnLogout();
    }

    @Test
    public void creationNewJob(){
        open("https://freelance.lsrv.in.ua/home");
        HomePageFreelance homePageFreelance = new HomePageFreelance();
        homePageFreelance
                .toNavLoginPageFreelance()
                .inputUsername("birdbird")
                .inputPassword("123456789")
                .clickOnLogin()
                .clickOnProfile()
                .createNewJob("JobAnastasiia","Job description","123")
                .assertCreation("JobAnastasiia")
                .clickOnLogout();
    }
    @Test
    public void daddingComment(){
        open("https://freelance.lsrv.in.ua/home");
        HomePageFreelance homePageFreelance = new HomePageFreelance();
        homePageFreelance
                .toNavLoginPageFreelance()
                .inputUsername("birdbird")
                .inputPassword("123456789")
                .clickOnLogin()
                .clickView("JobAnastasiia")
                .addComment("this is awesome job")
                .assertComment("achaika","this is awesome job")
                .clickOnLogout();
}
    @Test
    public void viewJobandDeleteOne(){
        open("https://freelance.lsrv.in.ua/home");
        HomePageFreelance homePageFreelance = new HomePageFreelance();
        homePageFreelance
                .toNavLoginPageFreelance()
                .inputUsername("birdbird")
                .inputPassword("123456789")
                .clickOnLogin()
                .clickOnProfile()
                .assertQuantityOfComments("1","JobAnastasiia")
                .removeJob("JobAnastasiia")
                .clickOnLogout();


}
}
