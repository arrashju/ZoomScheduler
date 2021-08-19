package com.example.demo.meeting;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.*;

@Service
public class MeetingService {

    public static void sendRequest(JSONObject json) throws Exception { //

        HttpClient client = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10)).build();
        HttpResponse response = null;

        String email = "justin.ar.rasheed@gmail.com";
        String jwt = "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOm51bGwsImlzcyI6ImxYdmx0SUNpU3JHS3RoSDQzM3lDTlEiLCJleHAiOjE2MjkzMjEwODksImlhdCI6MTYyODcxNjI5MH0.ARcsBEW-h791z5RlkTgV8pOmjODFnfaEwI18CKNSuSE";
        String endPoint = "https://api.zoom.us/v2/users/" + email + "/meetings";

        URI uri = URI.create(endPoint);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .POST(HttpRequest.BodyPublishers.ofString(json.toString()))
                .header("Authorization", jwt)
                .header("Content-Type", "application/json")
                .header("Cookie", "_zm_lang=en-US; _zm_mtk_guid=b2fed383f6f345c78ef07479027467b9; cred=BD62C442778CB22500BE7569841E59BD")
                .build();

        response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Status Code : " + response.statusCode());
        System.out.println("Body : " + response.body());
    }
}