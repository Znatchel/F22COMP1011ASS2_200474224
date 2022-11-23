package com.example.f22comp1011ass2_200474224;


import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class APIUtility {

    public APIUtility() throws IOException, InterruptedException {
    }

   /**     * This method will call the  api with the search term
     * provided
     */
    public static void getNewsFromAPI(String searchTerm) throws IOException, InterruptedException {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://ukraine-war-live.p.rapidapi.com/news/guardian"))
                .header("X-RapidAPI-Key", "4a6922780bmshcf37e433366936bp15fab7jsn72440499208b")
                .header("X-RapidAPI-Host", "ukraine-war-live.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<Path> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofFile(Paths.get("news.json")));




    }


}
