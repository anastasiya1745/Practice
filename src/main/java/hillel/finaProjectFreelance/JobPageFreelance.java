package hillel.finaProjectFreelance;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class JobPageFreelance {

    @Step("Add the comment")
    public JobPageFreelance addComment(String comment){

        $x("//textarea[contains(@class,'mat-input-element')]").setValue(comment);
        $x("//button[contains(@class,'mat-flat-button')]/span[contains(text(),'Leave comment')]").click();
        System.out.println("success");
        return this;
    }
    @Step("Assert successful adding comment")
    public JobPageFreelance assertComment(String username,String comment) {
        $x("//mat-card-subtitle/span[contains(text(),'added by "+username+"')]/../../mat-card-content/p[contains(text(),'h')]")
                .shouldBe(Condition.exist)
                .getText()
                .contains(comment);
        return this;
    }
    @Step("Logout")
    public HomePageFreelance clickOnLogout(){
        $x("//button[@mattooltip='Profile']").click();
        $x("//button[contains(@class,'mat-menu-item')][text()='Profile']").click();
        return new HomePageFreelance();
    }
}
