package hillel.rest;

import okhttp3.*;
import okhttp3.internal.http.RealResponseBody;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class OkHhttpTest {
   private String baseurl = "https://petstore.swagger.io/v2";
   String jsonOrder = "{\n" +
           "  \"id\": 0,\n" +
           "  \"petId\": 0,\n" +
           "  \"quantity\": 0,\n" +
           "  \"shipDate\": \"2021-10-20T12:57:49.138Z\",\n" +
           "  \"status\": \"placed\",\n" +
           "  \"complete\": true\n" +
           "}";
    RequestBody requestBody = RequestBody.create(jsonOrder.getBytes(StandardCharsets.UTF_8));
    @Test
    public void okhttpTest() throws IOException {

        Request request = new Request.Builder()
                .url(baseurl + "/store/inventory")
                .post(requestBody)
                .header("Content-Type",
                        "application/json")
                .build();

        OkHttpClient client = new OkHttpClient();
        Call call = client.newCall(request);

        Response response = call.execute();
        System.out.println(response.code());
        System.out.println(response.body().string());

    }
}
