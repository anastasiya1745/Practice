package hillel.UItestFreelance.API;

import hillel.finaProjectFreelance.restAPI.ApiFreelance;
import org.testng.annotations.Test;

import java.io.IOException;

public class job_controller {



    @Test
    public void getAllJobs() throws IOException {
        new ApiFreelance().getAlljobs();
    }

    @Test
    public void createJob() throws IOException {
        new ApiFreelance().createNewJob("Job2","Job2","1234","achaika_sd");
    }
    @Test
    public void deleteJob() throws IOException {
        new ApiFreelance().deleteJob(562,"Job2","Job2","1234","achaika_sd","0");
    }

    @Test
    public void getJobId() throws IOException {
        new ApiFreelance().getJobId(562);
    }


}
