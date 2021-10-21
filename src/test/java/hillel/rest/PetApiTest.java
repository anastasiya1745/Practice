package hillel.rest;

import okhttp3.Response;
import org.testng.annotations.Test;

import java.io.IOException;

public class PetApiTest {

    @Test

    public void petApiTest() throws IOException {
        new PetApi().createNewPet();
        new PetApi().updatePet();
       // new PetApi().getPetByID();
        System.out.println("done");

    }
}
