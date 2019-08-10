package com.balaniuc.anton;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class App {
    public static void main(String[] args) {

        OptionalMapper mapper = new OptionalMapper();
        HttpRequest request = HttpRequest.newBuilder(URI.create("https://data.smartdublin" + ".ie/cgi-bin/rtpi" +
                "/realtimebusinformationf?stopid=476&format=json"))
                .build();

        HttpClient.newHttpClient()
                .sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenApply(body -> mapper.getValue(body, Result.class))
                .thenAccept(System.out::println).join();



    }

}
