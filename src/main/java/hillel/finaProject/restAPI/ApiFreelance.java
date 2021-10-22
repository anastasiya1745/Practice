package hillel.finaProject.restAPI;

import io.qameta.allure.Step;
import okhttp3.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ApiFreelance {

    private RequestBody requestBody;
    private Request request;
    private OkHttpClient client;
    private Response response;

    private String baseurl = "https://freelance.lsrv.in.ua";
    private String token ="eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiIzMTMiLCJuYW1lIjpudWxsLCJpZCI6IjMxMyIsInVzZXJuYW1lIjoiY2hhaWthQW5hc3Rhc2l5YSIsImxhc3RuYW1lIjpudWxsLCJpYXQiOjE2MzQ5MDkxMTMsImV4cCI6MTYzNDkxMjcxM30.dT9HJ0mIocRClvzUalAvkU20Id5UyRO7mfg28Jo3Y7T9SUMrwBQdB7m2LTATo_cDPTSeyFQWZXfApghT5vZdQA";
    private String username = "chaikaAnastasiya";
    private String password = "123456789";
    private String id = "313";



    //<auth-controller>
    @Step ("Sign in")
    public void signIn() throws IOException {
        String body = "{\n" +
                "  \"username\": \""+username+"\",\n" +
                "  \"password\": \""+password+"\"\n" +
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
                "  \"username\": \""+username+"\",\n" +
                "  \"password\": \""+password+"\",\n" +
                "  \"confirmPassword\": \""+password+"\"\n" +
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
                "  \"id\": "+id+",\n" +
                "  \"username\": \""+username+"\",\n" +
                "  \"name\": \"Anastasiuuua\",\n" +
                "  \"lastname\": \"Chaika\"\n" +
                "}";
        requestBody = RequestBody.create(body.getBytes(StandardCharsets.UTF_8));
        client = new OkHttpClient();

        request = new Request.Builder()
                .url(baseurl+"/api/user/update")
                .header("Authorization","Bearer "+ token)
                .header("Content-Type", "application/json")
                .post(requestBody)
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
        String url = "/api/user/" + userId;
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
                "  \"user\": \""+username+"\",\n" +
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
        String url = "/api/job/delete/" + jobID;
        String body = "{\n" +
                "  \"id\": "+jobID+",\n" +
                "  \"title\": \"Job2\",\n" +
                "  \"description\": \"Job2\",\n" +
                "  \"price\": 123,\n" +
                "  \"user\": \""+username+"\",\n" +
                "  \"noOfComments\": 0\n" +
                "}";
        requestBody = RequestBody.create(body.getBytes(StandardCharsets.UTF_8));
        request = new Request.Builder()
                .url(baseurl + url)
                .header("Authorization","Bearer "+ token)
                .header("Content-Type", "application/json")
                .post(requestBody)
                .build();

        client = new OkHttpClient();
        Call call= client.newCall(request);
        response = call.execute();
        System.out.println(response.body().string());
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
                "  \"message\": \"some comments\",\n" +
                "  \"username\": \""+username+"\",\n" +
                "  \"commentDate\": \"string\"\n" +
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
    //<image_controller>
    @Step ("get Profile image")
    public void getProfileImage() throws IOException {

        request = new Request.Builder()
                .url(baseurl + "/api/image/profile")
                .header("Authorization","Bearer "+ token)
                .header("Content-Type", "application/json")
                .build();
        client = new OkHttpClient();
        Call call= client.newCall(request);
        response = call.execute();
        System.out.println(response.code());

    }
    @Step ("get Profile image by user ID")
    public void getImageByUserID(int id) throws IOException {
        String url = "/api/image/"+id;
        request = new Request.Builder()
                .url(baseurl + url)
                .header("Authorization","Bearer "+ token)
                .header("Content-Type", "application/json")
                .build();
        client = new OkHttpClient();
        Call call= client.newCall(request);
        response = call.execute();
        System.out.println(response.code());

    }
    @Step ("upload image")
    public void uploadImage(String path) throws IOException {
        String body = "{\n" +
                "  \"file\": "+path+"\"\"\n" + "}";
        requestBody = RequestBody.create(body.getBytes(StandardCharsets.UTF_8));
        client = new OkHttpClient();
        request = new Request.Builder()
                .url(baseurl+"/api/image/upload")
                .header("Authorization","Bearer "+ token)
                .header("Content-Type", "application/json")
                .post(requestBody)
                .build();

        Call call = client.newCall(request);
        response = call.execute();
        System.out.println(response.body().string());
    //</image_controller>
}}
