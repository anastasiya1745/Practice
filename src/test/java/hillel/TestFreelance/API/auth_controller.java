package hillel.TestFreelance.API;

import hillel.finaProject.restAPI.ApiFreelance;
import org.testng.annotations.Test;

import java.io.IOException;

public class auth_controller {

    @Test
    public void signIn() throws IOException {
        new ApiFreelance().signIn();
    }
    @Test
    public void signUp() throws IOException {
        new ApiFreelance().signUp();
    }

}

