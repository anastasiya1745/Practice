package hillel.selenideCheckBox;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class DynamicControlPage {

   private SelenideElement checkbox = $x("//input[@type='checkbox']");
   private SelenideElement buttonAddOrRemove = $x("//button[@type='button']");
   ;

   public void setCheckbox(){
       checkbox.click();
   }

   public void addOrRemove(boolean remove){
       buttonAddOrRemove.shouldBe(Condition.enabled).click();
       if (remove) {
           checkbox.should(Condition.disappear);
       }
       else {checkbox.should(Condition.appear);}
   }

}
