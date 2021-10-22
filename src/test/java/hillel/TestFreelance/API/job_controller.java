package hillel.TestFreelance.API;

import hillel.finaProject.restAPI.ApiFreelance;
import org.testng.annotations.Test;

import java.io.IOException;

public class job_controller {



    @Test
    public void getAllJobs() throws IOException {
        new ApiFreelance().getAlljobs();
    }

    @Test
    public void createJob() throws IOException {
        new ApiFreelance().createNewJob();
    }
    @Test
    public void deleteJob() throws IOException {
        new ApiFreelance().deleteJob(2);
    }

    @Test
    public void getJobId() throws IOException {
        new ApiFreelance().getJobId(2);
    }


}
