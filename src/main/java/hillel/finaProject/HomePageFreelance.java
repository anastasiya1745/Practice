package hillel.finaProject;


import io.qameta.allure.Step;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.*;

public class HomePageFreelance {

    @Step("Navigate to Login Page")
    public LoginPageFreelance toNavLoginPageFreelance(){

       $(By.cssSelector("div a:last-child")).click();
        return new LoginPageFreelance();
    }
    @Step("Navigate to Register Page")
    public RegisterPageFreelance toNavRegisterPageFreelance(){

        $(By.cssSelector("div a:first-child")).click();
        return new RegisterPageFreelance();
    }

}
