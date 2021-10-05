package hillel.ActionFile;

import hillel.BaseTest;
import hillel.pageObjectFile.cleanUp;
import hillel.pageObjectFile.downloadFile;
import hillel.pageObjectFile.modifyFile;
import hillel.pageObjectFile.uploadFile;
import org.testng.annotations.Test;

public class TestFile extends BaseTest {
    @Test
    public void ActionFile() throws InterruptedException {

        downloadFile downloadFile = new downloadFile(driver);
        downloadFile.actionDownload();
        modifyFile modifyFile = new modifyFile(driver);
        modifyFile.actionWrite();
        uploadFile uploadFile = new uploadFile(driver);
        uploadFile.uploadAction();
        cleanUp cleanUp = new cleanUp(driver);
        cleanUp.cleanUpAction();
    }
}
