package hillel.selenideTest;

import hillel.selenideCheckBox.EnableDisableControl;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class TestEnableDisableControl {

    @Test

    public void EnDisabTest(){
        open("https://the-internet.herokuapp.com/dynamic_controls");
        EnableDisableControl enableDisableControl = new EnableDisableControl();

        enableDisableControl.setButtonEnableOrDisable(true);
        enableDisableControl.enterInputValue();
        enableDisableControl.setButtonEnableOrDisable(false);
        System.out.println("done");
    }
}
