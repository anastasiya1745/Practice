package hillel.TestFreelance.API;

import hillel.finaProject.restAPI.ApiFreelance;
import org.testng.annotations.Test;

import java.io.IOException;

public class comment_controller {


    @Test
    public void getComments() throws IOException {
        new ApiFreelance().getComments(2);
    }
    @Test
    public void addComment() throws IOException {
        new ApiFreelance().addComment(2);
    }

}
