package com.balaniuc.anton;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class App 
{
    public static void main( String[] args )
    {

        HttpRequest request = HttpRequest.newBuilder(URI.create("https://data.smartdublin" +
                ".ie/cgi-bin/rtpi/realtimebusinformation?stopid=476&format=json"))
                .header("Accept", "application/json")
                .build();

         HttpClient.newHttpClient()
                .sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenApply(body -> {
                    try {
                        return new ObjectMapper().readValue(body,Result.class);
                    } catch (Exception e){
                        e.printStackTrace();
                        return null;
                    }
                }).thenAccept(System.out::println).join();
    }

}
