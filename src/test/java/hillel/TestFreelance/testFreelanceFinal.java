package hillel.TestFreelance;

import hillel.BaseTest;
import hillel.finaProject.HomePageFreelance;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class testFreelanceFinal extends BaseTestFreelance{

    @Test
    public void testRegisterUser(String username, String password){
        open("https://freelance.lsrv.in.ua/home");
        HomePageFreelance homePageFreelance = new HomePageFreelance();
        homePageFreelance
                .toNavRegisterPageFreelance()
                .setInfo(username,"anastasiya","chaika",password,"123456789")
                .signIn();}

    @Test
    public void testModifyUserInfo(){
        open("https://freelance.lsrv.in.ua/home");
        HomePageFreelance homePageFreelance = new HomePageFreelance();
        homePageFreelance
                .toNavLoginPageFreelance()
                .inputUsername("rer")
                .inputPassword("123456789")
                .clickOnLogin()
                .clickOnProfile()
                .modifyInfo("Lizy", "Okta")
                .assertAction("Lizy Okta");
    }

    @Test
    public void testCreationNewJob(){
        open("https://freelance.lsrv.in.ua/home");
        HomePageFreelance homePageFreelance = new HomePageFreelance();
        homePageFreelance
                .toNavLoginPageFreelance()
                .inputUsername("rer")
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
                .inputUsername("rer")
                .inputPassword("123456789")
                .clickOnLogin()
                .clickView("Job2")
                .addComment("this is awesome job")
                .assertComment("rer","this is awesome job");
}
    @Test
    public void testViewJobandDeleteOne(){
        open("https://freelance.lsrv.in.ua/home");
        HomePageFreelance homePageFreelance = new HomePageFreelance();
        homePageFreelance
                .toNavLoginPageFreelance()
                .inputUsername("rer")
                .inputPassword("123456789")
                .clickOnLogin()
                .clickOnProfile()
                .assertQuantityOfComments("0","Job2")
                .removeJob("Job2");


}
}
