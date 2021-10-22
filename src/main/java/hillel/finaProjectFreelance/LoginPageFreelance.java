package hillel.finaProjectFreelance;


import io.qameta.allure.Step;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;

public class LoginPageFreelance {


    @Step("Enter username")
        public LoginPageFreelance inputUsername(String username){
            $(By.cssSelector("div input[id='mat-input-0']")).setValue(username);
            return this;
        }
         @Step("Enter password")
         public LoginPageFreelance inputPassword(String password){
            $(By.cssSelector("div input[id='mat-input-1']")).setValue(password);
             return this;
    }
        @Step ("Click on Login")
        public MainPageFreelance clickOnLogin(){
        $(By.cssSelector("div button.mat-focus-indicator")).click();

        return new MainPageFreelance();
    }
        @Step ("Click on Register")
        public RegisterPageFreelance clickOnRegister(){
        $(By.linkText("Register")).click();

        return new RegisterPageFreelance();
    }

}
