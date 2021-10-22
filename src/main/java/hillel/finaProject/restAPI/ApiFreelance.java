package hillel.finaProject.restAPI;

import io.qameta.allure.Step;
import okhttp3.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ApiFreelance {

    private RequestBody requestBody;
    private Request request;
    String token ="eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiIyOTgiLCJuYW1lIjpudWxsLCJpZCI6IjI5OCIsInVzZXJuYW1lIjoicmVyIiwibGFzdG5hbWUiOm51bGwsImlhdCI6MTYzNDg5OTEzNywiZXhwIjoxNjM0OTAyNzM3fQ.jKUEYVX7gYipaOHlKJ9n29QRr4l9D1i0oa7iV753IuFxTiDKMWMQEhSnmO1g0ApNTiQfW3-Vfh4_MFfpGubqkw";
    private OkHttpClient client;
    private Response response;
    private String baseurl = "https://freelance.lsrv.in.ua";


    //<auth-controller>
    @Step ("Sign in")
    public void signIn() throws IOException {
        String body = "{\n" +
                "  \"username\": \"rer\",\n" +
                "  \"password\": \"123456789\"\n" +
                "}";
        requestBody = RequestBody.create(body.getBytes(StandardCharsets.UTF_8));
        client = new OkHttpClient();
        request = new Request.Builder()
                .url(baseurl+"/api/auth/signin")
                .header("Content-Type", "application/json")
                .post(requestBody)
                .build();

        Call call = client.newCall(request);
        response = call.execute();
        System.out.println(response.body().string());



    }

    @Step ("Sign up")
    public void signUp() throws IOException {
        String body = "{\n" +
                "  \"username\": \"rer\",\n" +
                "  \"password\": \"123456789\",\n" +
                "  \"confirmPassword\": \"123456789\"\n" +
                "}";
        requestBody = RequestBody.create(body.getBytes(StandardCharsets.UTF_8));
        client = new OkHttpClient();
        request = new Request.Builder()
                .url(baseurl+"/api/auth/signup")
                .header("Content-Type", "application/json")
                .post(requestBody)
                .build();

        Call call = client.newCall(request);
        response = call.execute();
        System.out.println(response.body().string());



    }
    //</auth-controller>
    //<user-controller>
    @Step ("Update user info")
    public void updateInfo() throws IOException {
        String body = "{\n" +
                "  \"id\": 298,\n" +
                "  \"username\": \"rer\",\n" +
                "  \"name\": \"Anastasiuuua\",\n" +
                "  \"lastname\": \"Chaika\"\n" +
                "}";
        requestBody = RequestBody.create(body.getBytes(StandardCharsets.UTF_8));
        client = new OkHttpClient();

        request = new Request.Builder()
                .url(baseurl+"/api/user/update")
                .header("Authorization","Bearer "+ token)
                .header("Content-Type", "application/json")
                .put(requestBody)
                .build();

        Call call = client.newCall(request);
        response = call.execute();
        System.out.println(response.body().string());



    }


    @Step("get userInfo")
    public void getUserInfo() throws IOException {

        client = new OkHttpClient();
        request = new Request.Builder()
                .url(baseurl+"/api/user/")
                .header("Authorization","Bearer "+ token)
                .header("Content-Type", "application/json")
                .build();

        Call call = client.newCall(request);
        response = call.execute();
        System.out.println(response.body().string());

    }
    @Step ("get user by userID")
    public void getUserId(int userId) throws IOException {
        String url = "/store/order/" + userId;
        request = new Request.Builder()
                .url(baseurl + url)
                .header("Authorization","Bearer "+ token)
                .header("Content-Type", "application/json")
                .build();
        client = new OkHttpClient();
        Call call= client.newCall(request);
        response = call.execute();
        System.out.println(response.body().string());

    }
    //</user-controller>
    //<job-controller>

    @Step ("get all jobs")
    public void getAlljobs() throws IOException {
        client = new OkHttpClient();
        request = new Request.Builder()
                .url(baseurl+"/api/job/all")
                .header("Authorization","Bearer "+ token)
                .header("Content-Type", "application/json")
                .build();

        Call call = client.newCall(request);
        response = call.execute();
        System.out.println(response.body().string());

    }
    @Step ("create a new job")
    public void createNewJob() throws IOException {
        String body = "{\n" +
                "  \"id\": 0,\n" +
                "  \"title\": \"Job2\",\n" +
                "  \"description\": \"Job2\",\n" +
                "  \"price\": 123,\n" +
                "  \"user\": \"rer\",\n" +
                "  \"noOfComments\": 0\n" +
                "}";
        requestBody = RequestBody.create(body.getBytes(StandardCharsets.UTF_8));
        client = new OkHttpClient();
        request = new Request.Builder()
                .url(baseurl+"/api/job/create")
                .header("Authorization","Bearer "+ token)
                .header("Content-Type", "application/json")
                .post(requestBody)
                .build();

        Call call = client.newCall(request);
        response = call.execute();
        System.out.println(response.body().string());



    }
    @Step ("get job by userID")
    public void getJobId(int jobId) throws IOException {
        String url = "/api/job/" + jobId;
        request = new Request.Builder()
                .url(baseurl + url)
                .header("Authorization","Bearer "+ token)
                .header("Content-Type", "application/json")
                .build();
        client = new OkHttpClient();
        Call call= client.newCall(request);
        response = call.execute();
        System.out.println(response.body().string());

    }

    @Step ("delete job by id")
    public void deleteJob(int jobID) throws IOException {
        String url = "/api/job/delete" + jobID;
        request = new Request.Builder()
                .url(baseurl + url)
                .header("Authorization","Bearer "+ token)
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
    //</job-controller>
    //<comment_controller>
    @Step ("get comments by jobID")
    public void getComments(int jobId) throws IOException {
        String url = "/api/comment/" + jobId + "/all";
        request = new Request.Builder()
                .url(baseurl + url)
                .header("Authorization","Bearer "+ token)
                .header("Content-Type", "application/json")
                .build();
        client = new OkHttpClient();
        Call call= client.newCall(request);
        response = call.execute();
        System.out.println(response.body().string());

    }
    @Step ("add a new comment")
    public void addComment(int jobId) throws IOException {
        String body = "{\n" +
                "  \"id\": 0,\n" +
                "  \"title\": \"Job2\",\n" +
                "  \"description\": \"Job2\",\n" +
                "  \"price\": 123,\n" +
                "  \"user\": \"rer\",\n" +
                "  \"noOfComments\": 0\n" +
                "}";
        requestBody = RequestBody.create(body.getBytes(StandardCharsets.UTF_8));
        client = new OkHttpClient();
        String url = "/api/comment/" + jobId + "/create";
        request = new Request.Builder()
                .url(baseurl+url)
                .header("Authorization","Bearer "+ token)
                .header("Content-Type", "application/json")
                .post(requestBody)
                .build();

        Call call = client.newCall(request);
        response = call.execute();
        System.out.println(response.body().string());


    }
    //</comment_controller>
}
