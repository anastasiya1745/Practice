package hillel.pageObjectFile;

import hillel.PageObject.BasePage;
import org.openqa.selenium.WebDriver;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class cleanUp extends BasePage {

    public cleanUp(WebDriver driver){super(driver);}

    public cleanUp cleanUpAction(){
        try{
            // find the file
            String path="C:\\Users\\achaika\\IdeaProjects\\Practice\\target\\loremipsum.txt";
            File file = new File(path);

            // If file exists, then delete it
            if (file.exists()) {
                file.delete();
                System.out.println("delete the file");
            }

        }
        catch(Exception e){
            System.out.println(e);
        }
        return this;

    }
}
