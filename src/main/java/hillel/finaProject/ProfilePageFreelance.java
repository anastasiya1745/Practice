package hillel.finaProject;

import com.codeborne.selenide.*;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static com.codeborne.selenide.Selenide.*;

public class ProfilePageFreelance {



    @Step("Edit user's info")
    public ProfilePageFreelance modifyInfo(String name, String lastname){

        $x("//span[contains(@class,'mat-button-wrapper') and contains(.,'Edit Info')]").click();
        $("div input[id='mat-input-2']").setValue(name);
        $("div input[id='mat-input-3']").setValue(lastname);
        $x("//span[@class='mat-button-wrapper'and contains(text(),'Update')]").click();
        return this;
    }
    @Step("Assert successful modification")
    public ProfilePageFreelance assertAction(String assertValue) {
        $("div h3:last-child").shouldBe(Condition.exist).getText().contains(assertValue);
        System.out.println("success");
        return this;
    }
    @Step("Create the new Job")
    public ProfilePageFreelance createNewJob(String title, String description, String price) {
        $x("//span[@class='mat-button-wrapper'and contains(text(),'Add job')]").click();
        $x("(//input[contains(@class,'mat-input-element mat-form-field-autofill-control')])[1]").setValue(title);
        $x("//textarea[contains(@class,'mat-input-element mat-form-field-autofill-control')]").setValue(description);
        $x("(//input[contains(@class,'mat-input-element mat-form-field-autofill-control')])[2]").setValue(price);
        $x("//span[@class='mat-button-wrapper'and contains(text(),'Create job')]").click();
        return this;
    }
    @Step("Assert successful creation the new job")
    public ProfilePageFreelance assertCreation(String title) {
        $x("//div/mat-card-title[contains(text(),'"+title+"')]").shouldBe(Condition.exist).getText().contains(title);
        return this;
    }
    @Step("Assert quantity of comments")
    public ProfilePageFreelance assertQuantityOfComments(String quantity, String title) {
        $x("//div/mat-card-title[contains(text(),'"+title+"')]/../../../mat-card-subtitle/mat-card-subtitle[contains(text(),'"+quantity+"')]")
                .shouldBe(Condition.exist).getText().contains(quantity);
        return this;
    }

    @Step("Remove the job")
    public ProfilePageFreelance removeJob(String title){
        $x("//div/mat-card-title[contains(text(),'"+title+"')]/../../../mat-card-actions/button").click();
        webdriver().driver().switchTo().alert().accept();
        System.out.println("successful delete");
        return this;
    }


}
