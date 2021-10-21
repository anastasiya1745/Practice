package hillel.rest;

import okhttp3.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class PetApi {

    private RequestBody requestBody;
    private Request request;
    private OkHttpClient client;
    private Response response;
    private String baseurl = "https://petstore.swagger.io/v2";

    public void createNewPet() throws IOException {
        String body = "{\n" +
                "  \"id\": 0,\n" +
                "  \"category\": {\n" +
                "    \"id\": 0,\n" +
                "    \"name\": \"string\"\n" +
                "  },\n" +
                "  \"name\": \"doggie\",\n" +
                "  \"photoUrls\": [\n" +
                "    \"string\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 0,\n" +
                "      \"name\": \"string\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"available\"\n" +
                "}";
        requestBody = RequestBody.create(body.getBytes(StandardCharsets.UTF_8));
        client = new OkHttpClient();
        request = new Request.Builder()
                .url(baseurl+"/pet")
                .header("Content-Type", "application/json")
                .post(requestBody)
                .build();

        Call call = client.newCall(request);
        response = call.execute();
        if (response.code() != 200) {
            throw new IOException();
        }



    }
    public void updatePet() throws IOException {
        String body = "{\n" +
                "  \"id\": 0,\n" +
                "  \"category\": {\n" +
                "    \"id\": 0,\n" +
                "    \"name\": \"string\"\n" +
                "  },\n" +
                "  \"name\": \"doggie\",\n" +
                "  \"photoUrls\": [\n" +
                "    \"string\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 0,\n" +
                "      \"name\": \"string\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"available\"\n" +
                "}";
        requestBody = RequestBody.create(body.getBytes(StandardCharsets.UTF_8));
        client = new OkHttpClient();
        request = new Request.Builder()
                .url(baseurl+"/pet")
                .header("Content-Type", "application/json")
                .put(requestBody)
                .build();

        Call call = client.newCall(request);
        response = call.execute();
        if (response.code() != 200) {
            throw new IOException();
        }


    }
    public void getPetByID(int petId) throws IOException {
        String url = "/pet" + petId;
        request = new Request.Builder()
                .url(baseurl + url)
                .header("Content-Type", "application/json")
                .build();
        client = new OkHttpClient();
        Call call= client.newCall(request);
        call.execute();
        if (response.code() != 200){
            throw new IOException();
        }

    }
}
