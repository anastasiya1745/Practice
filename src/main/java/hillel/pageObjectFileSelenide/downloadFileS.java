package hillel.pageObjectFileSelenide;
import org.openqa.selenium.By;
import java.io.File;
import java.io.FileNotFoundException;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class downloadFileS {
    public void downloadFile() throws FileNotFoundException {
       open("https://the-internet.herokuapp.com/download");
        File fileS = $(By.linkText("loremipsum.txt")).download();
        System.out.println("downloading is done");
    }
}
