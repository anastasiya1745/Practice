package hillel.TestFreelance;

import hillel.BaseTest;
import hillel.finaProject.HomePageFreelance;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class testFreelanceFinal extends BaseTestFreelance{

    @Test
    public void testRegisterUser(){
        open("https://freelance.lsrv.in.ua/home");
        HomePageFreelance homePageFreelance = new HomePageFreelance();
        homePageFreelance
                .toNavRegisterPageFreelance()
                .setInfo("achaika","anastasiya","chaika","123456789","123456789")
                .signIn();
    }

    @Test
    public void testModifyUserInfo(){
        open("https://freelance.lsrv.in.ua/home");
        HomePageFreelance homePageFreelance = new HomePageFreelance();
        homePageFreelance
                .toNavLoginPageFreelance()
                .inputUsername("achaika")
                .inputPassword("123456789")
                .clickOnLogin()
                .clickOnProfile()
                .modifyInfo("anastasiya", "Okta")
                .assertAction("anastasiya Okta");
    }

    @Test
    public void testCreationNewJob(){
        open("https://freelance.lsrv.in.ua/home");
        HomePageFreelance homePageFreelance = new HomePageFreelance();
        homePageFreelance
                .toNavLoginPageFreelance()
                .inputUsername("achaika")
                .inputPassword("123456789")
                .clickOnLogin()
                .clickOnProfile()
                .createNewJob("Job2","Job description","123")
                .assertCreation("Job2");
    }
    @Test
    public void testAddingComment(){
        open("https://freelance.lsrv.in.ua/home");
        HomePageFreelance homePageFreelance = new HomePageFreelance();
        homePageFreelance
                .toNavLoginPageFreelance()
                .inputUsername("achaika")
                .inputPassword("123456789")
                .clickOnLogin()
                .clickView("Job2")
                .addComment("this is awesome job")
                .assertComment("achaika","this is awesome job");
}
    @Test
    public void testViewJobandDeleteOne(){
        open("https://freelance.lsrv.in.ua/home");
        HomePageFreelance homePageFreelance = new HomePageFreelance();
        homePageFreelance
                .toNavLoginPageFreelance()
                .inputUsername("achaika")
                .inputPassword("123456789")
                .clickOnLogin()
                .clickOnProfile()
                .assertQuantityOfComments("1","Job2")
                .removeJob("Job2");


}
}
