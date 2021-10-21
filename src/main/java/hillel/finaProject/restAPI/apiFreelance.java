package hillel.finaProject.restAPI;

import io.qameta.allure.Step;
import okhttp3.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class apiFreelance {

    private RequestBody requestBody;
    private Request request;
    private OkHttpClient client;
    private Response response;
    private String baseurl = "https://petstore.swagger.io/v2";

    @Step("get inventories")
    public void getInventories() throws IOException {

        client = new OkHttpClient();
        request = new Request.Builder()
                .url(baseurl+"/store/inventory")
                .header("Content-Type", "application/json")
                .build();

        Call call = client.newCall(request);
        response = call.execute();
        System.out.println(response.body().string());

    }
    @Step ("get place order")
    public void placeOrder() throws IOException {
        String body = "{\n" +
                "  \"id\": 3,\n" +
                "  \"petId\": 12,\n" +
                "  \"quantity\": 7,\n" +
                "  \"shipDate\": \"2021-10-20T10:52:39.015Z\",\n" +
                "  \"status\": \"adopted\",\n" +
                "  \"complete\": true\n" +
                "}";
        requestBody = RequestBody.create(body.getBytes(StandardCharsets.UTF_8));
        client = new OkHttpClient();
        request = new Request.Builder()
                .url(baseurl+"/store/order")
                .header("Content-Type", "application/json")
                .post(requestBody)
                .build();

        Call call = client.newCall(request);
        response = call.execute();
        System.out.println(response.body().string());



    }
    @Step ("get purchase order by ID")
    public void purchaseOrder(int orderID) throws IOException {
        String url = "/store/order/" + orderID;
        request = new Request.Builder()
                .url(baseurl + url)
                .header("Content-Type", "application/json")
                .build();
        client = new OkHttpClient();
        Call call= client.newCall(request);
        response = call.execute();
        System.out.println(response.body().string());

    }
    @Step ("delete purchase order by id")
    public void deletePurchaseOrder(int orderID) throws IOException {
        String url = "/store/order/" + orderID;
        request = new Request.Builder()
                .url(baseurl + url)
                .header("Content-Type", "application/json")
                .delete()
                .build();
        client = new OkHttpClient();
        Call call= client.newCall(request);
        response = call.execute();
        System.out.println(response.code());
        if (response.code() != 200){
            throw new IOException();
        }

    }
}
