package hillel.TestFreelance.API;

import hillel.finaProject.restAPI.ApiFreelance;
import org.testng.annotations.Test;

import java.io.IOException;

public class image_controller {


    @Test
    public void getImageProfile() throws IOException {
        new ApiFreelance().getProfileImage();
    }
    @Test
    public void getImageByUserId() throws IOException {
        new ApiFreelance().getImageByUserID(322);
    }
    @Test
    public void uploadImage() throws IOException {
        new ApiFreelance().uploadImage("C:\\Users\\achaika\\IdeaProjects\\Practice\\Jamie-Foxx-as-Joe-in-Soul.jpeg");
    }
}
