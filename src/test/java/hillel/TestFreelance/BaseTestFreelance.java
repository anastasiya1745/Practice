package hillel.TestFreelance;

import com.codeborne.selenide.SelenideDriver;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class BaseTestFreelance {

    private SelenideDriver driver;
    @AfterMethod
    public void takeScreenshot(ITestResult result) throws IOException {
        if (result.isSuccess()){
            File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            saveScreenshot(Files.readAllBytes(screenshot.toPath()));
        }
    }
    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshot(byte[] screenShot) {
        return screenShot;
    }
}
