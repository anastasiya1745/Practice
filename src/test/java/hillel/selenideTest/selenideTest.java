package hillel.selenideTest;

import hillel.pageObjectFileSelenide.downloadFileS;
import hillel.pageObjectFileSelenide.modifyFileS;
import hillel.pageObjectFileSelenide.uploadFileS;

import org.testng.annotations.Test;

import java.io.IOException;


public class selenideTest {

    @Test
    public void selenideTest() throws IOException{
        downloadFileS downloadFileS = new downloadFileS();
        modifyFileS modifyFileS = new modifyFileS();
        uploadFileS uploadFileS = new uploadFileS();


        downloadFileS.downloadFile();
        modifyFileS.modifyFile();
        uploadFileS.uploadFile();



    }


}
