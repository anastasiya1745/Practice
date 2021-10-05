package hillel.pageObjectFileSelenide;
import org.openqa.selenium.By;
import java.io.File;
import static com.codeborne.selenide.Selenide.*;

public class uploadFileS  {

    public void uploadFile(){
        open("https://the-internet.herokuapp.com/upload");
    File file = new File("loremipsum.txt");
    $x("//input[@id='file-upload']").uploadFile(file);
    $(By.cssSelector("input.button")).click();
        System.out.println("  uploading is done");
}}
