package hillel.finaProject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPageFreelance {


    @Step("Move to Profile")
    public ProfilePageFreelance clickOnProfile(){
        $x("//button[@mattooltip='Profile']").click();
        $x("//button[contains(@class,'mat-menu-item')][text()='Profile']").click();
        return new ProfilePageFreelance();
    }
    @Step("Logout")
    public HomePageFreelance clickOnLogout(){
        $x("//button[@mattooltip='Profile']").click();
        $x("//button[contains(@class,'mat-menu-item')][text()='Profile']").click();
        return new HomePageFreelance();
    }

    @Step("Click on View button")
    public JobPageFreelance clickView(String title){
        $x("//div/mat-card-title[contains(text(),'"+title+"')]/../../../mat-card-actions/button").click();
        return new JobPageFreelance();
    }
}
