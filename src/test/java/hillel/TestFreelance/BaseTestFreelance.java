package hillel.TestFreelance;

import io.qameta.allure.Attachment;

public class BaseTestFreelance {

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshot(byte[] screenShot) {
        return screenShot;
    }
}
