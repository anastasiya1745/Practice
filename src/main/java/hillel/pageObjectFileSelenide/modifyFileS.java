package hillel.pageObjectFileSelenide;
import java.io.FileWriter;
import java.io.IOException;

public class modifyFileS  {

    public void modifyFile() throws IOException {
        FileWriter fileWriter = new FileWriter("loremipsum.txt");
        fileWriter.write("Hello world");
        fileWriter.flush();
        fileWriter.close();
        System.out.println(" file is rewrite");
    }
}
