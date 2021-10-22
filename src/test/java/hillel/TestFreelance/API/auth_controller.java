package hillel.TestFreelance.API;

import hillel.finaProject.restAPI.ApiFreelance;
import org.testng.annotations.Test;

import java.io.IOException;

public class auth_controller {

    @Test
    public void signIn() throws IOException {
        new ApiFreelance().signIn("achaika_sd","123456789");
    }
    @Test
    public void signUp() throws IOException {
        new ApiFreelance().signUp("achaika_sd", "123456789");
    }

}

