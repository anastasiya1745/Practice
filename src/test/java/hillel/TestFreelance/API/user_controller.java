package hillel.TestFreelance.API;

import hillel.finaProject.restAPI.ApiFreelance;
import org.testng.annotations.Test;

import java.io.IOException;

public class user_controller {

    @Test
    public void updateInfo() throws IOException {
        new ApiFreelance().updateInfo();
    }

    @Test
    public void getUserInfo() throws IOException {
        new ApiFreelance().getUserInfo();
    }

    @Test
    public void getUserId() throws IOException {
        new ApiFreelance().getUserId(298);
    }
}
