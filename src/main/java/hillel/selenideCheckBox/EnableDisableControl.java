package hillel.selenideCheckBox;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class EnableDisableControl {

    private SelenideElement buttonEnableOrDisable = $x("//form[@id='input-example']/button[@type='button']");
    private SelenideElement inputField = $x("//input[@type='text']");

    public void enterInputValue(){
        inputField.setValue("hello world");
    }
    public void setButtonEnableOrDisable(boolean enable){
        buttonEnableOrDisable.click();
        if(enable){
            inputField.shouldBe(Condition.enabled).click();
        } else {
            inputField.shouldBe(Condition.disabled);
        }
    }
}
