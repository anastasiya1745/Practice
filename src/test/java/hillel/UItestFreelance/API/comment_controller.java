package hillel.UItestFreelance.API;

import hillel.finaProjectFreelance.restAPI.ApiFreelance;
import org.testng.annotations.Test;

import java.io.IOException;

public class comment_controller {


    @Test
    public void getComments() throws IOException {
        new ApiFreelance().getComments(562);
    }
    @Test
    public void addComment() throws IOException {
        new ApiFreelance().addComment(562,"my comment","achaika_sd");
    }

}
