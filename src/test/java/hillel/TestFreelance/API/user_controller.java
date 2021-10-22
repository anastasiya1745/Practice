package hillel.TestFreelance.API;

import hillel.finaProject.restAPI.ApiFreelance;
import org.testng.annotations.Test;

import java.io.IOException;

public class user_controller {

    @Test
    public void updateInfo() throws IOException {
        new ApiFreelance().updateInfo(322,"achaika_sd","Anastasiia","Chaika");
    }

    @Test
    public void getUserInfo() throws IOException {
        new ApiFreelance().getUserInfo();
    }

    @Test
    public void getUserId() throws IOException {
        new ApiFreelance().getUserId(322);
    }
}
