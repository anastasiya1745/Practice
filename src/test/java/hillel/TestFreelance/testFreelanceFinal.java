package hillel.TestFreelance;

import hillel.BaseTest;
import hillel.finaProject.HomePageFreelance;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class testFreelanceFinal extends BaseTestFreelance{

    @Test
    public void test1RegisterUser(){
        open("https://freelance.lsrv.in.ua/home");
        HomePageFreelance homePageFreelance = new HomePageFreelance();
        homePageFreelance
                .toNavRegisterPageFreelance()
                .setInfo("achaikatestt","anastasiya","chaika","123456789","123456789")
                .signIn();
    }

    @Test
    public void test2ModifyUserInfo(){
        open("https://freelance.lsrv.in.ua/home");
        HomePageFreelance homePageFreelance = new HomePageFreelance();
        homePageFreelance
                .toNavLoginPageFreelance()
                .inputUsername("achaikatestt")
                .inputPassword("123456789")
                .clickOnLogin()
                .clickOnProfile()
                .modifyInfo("anastasiya", "Okta")
                .assertAction("anastasiya Okta");
    }

    @Test
    public void test3CreationNewJob(){
        open("https://freelance.lsrv.in.ua/home");
        HomePageFreelance homePageFreelance = new HomePageFreelance();
        homePageFreelance
                .toNavLoginPageFreelance()
                .inputUsername("achaikatestt")
                .inputPassword("123456789")
                .clickOnLogin()
                .clickOnProfile()
                .createNewJob("Job2","Job description","123")
                .assertCreation("Job2");
    }
    @Test
    public void test4AddingComment(){
        open("https://freelance.lsrv.in.ua/home");
        HomePageFreelance homePageFreelance = new HomePageFreelance();
        homePageFreelance
                .toNavLoginPageFreelance()
                .inputUsername("achaikatestt")
                .inputPassword("123456789")
                .clickOnLogin()
                .clickView("Job2")
                .addComment("this is awesome job")
                .assertComment("achaika","this is awesome job");
}
    @Test
    public void test5ViewJobandDeleteOne(){
        open("https://freelance.lsrv.in.ua/home");
        HomePageFreelance homePageFreelance = new HomePageFreelance();
        homePageFreelance
                .toNavLoginPageFreelance()
                .inputUsername("achaikatestt")
                .inputPassword("123456789")
                .clickOnLogin()
                .clickOnProfile()
                .assertQuantityOfComments("1","Job2")
                .removeJob("Job2");


}
}
