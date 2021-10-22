package hillel.finaProject;

import com.codeborne.selenide.Condition;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class RegisterPageFreelance {


    public RegisterPageFreelance() {
        super();
    }

    @Step("Set user info for all fields in registration form")
    public RegisterPageFreelance setInfo(String username, String name,
                                         String lastname, String password,
                                         String passwordC ) {
        $("div input[id='mat-input-0']").setValue(username);
        $("div input[id='mat-input-1']").setValue(name);
        $("div input[id='mat-input-2']").setValue(lastname);
        $("div input[id='mat-input-3']").setValue(password);
        $("div input[id='mat-input-4']").setValue(passwordC);
        return this;

    }


    @Step("Confirm Registration")
    public RegisterPageFreelance confirmRegister() {
        $x("//span[@class='mat-button-wrapper']").click();

        return new RegisterPageFreelance();
    }
    /*@Step("Assert successful registration")
    public RegisterPageFreelance assertAction() {
        String ok = $("simple-snack-bar span").shouldBe(Condition.exist).getText();
        System.out.println(ok);
        return this;

    }*/
    @Step("Sign in from Registration")
    public LoginPageFreelance signIn() {
        $(By.linkText("Sign in")).click();
        return new LoginPageFreelance();
    }

}