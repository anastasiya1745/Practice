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
        modifyFile modifyFile = new modifyFile(driver);
        uploadFile uploadFile = new uploadFile(driver);
        cleanUp cleanUp = new cleanUp(driver);

        downloadFile.actionDownload();
        modifyFile.actionWrite();
        uploadFile.uploadAction();
        cleanUp.cleanUpAction();
    }
}
