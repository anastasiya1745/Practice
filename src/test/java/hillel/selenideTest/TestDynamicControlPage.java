package hillel.selenideTest;

import hillel.selenideCheckBox.DynamicControlPage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class TestDynamicControlPage {

    @Test

    public void dynControlTest(){
        open("https://the-internet.herokuapp.com/dynamic_controls");
        DynamicControlPage dynamicControlPage = new DynamicControlPage();

        dynamicControlPage.setCheckbox();
        dynamicControlPage.addOrRemove(true);
        dynamicControlPage.addOrRemove(false);
        dynamicControlPage.setCheckbox();
        System.out.println("done");
    }
}
