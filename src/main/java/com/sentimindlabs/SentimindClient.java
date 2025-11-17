package com.sentimindlabs;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class SentimindClient {

    private final static String BASE_URL = "https://sentimind-labs.com";
    private final HttpClient http = HttpClient.newHttpClient();
    private final ObjectMapper mapper = new ObjectMapper();

    // -------------------------
    // SINGLE SENTIMENT ANALYSIS
    // -------------------------
    public SingleSentimentResponse analyzeSentiment(String text) throws Exception {

        String body = mapper.writeValueAsString(
                java.util.Map.of("text", text)
        );

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL + "/v1/analyze/sentiment/single"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(body, StandardCharsets.UTF_8))
                .build();

        HttpResponse<String> response = http.send(request, HttpResponse.BodyHandlers.ofString());

        return mapper.readValue(response.body(), SingleSentimentResponse.class);
    }

    // -------------------------
    // BATCH SENTIMENT ANALYSIS
    // -------------------------
    public BatchSentimentResponse analyzeBatchSentiment(List<String> texts) throws Exception {

        String body = mapper.writeValueAsString(
                java.util.Map.of("texts", texts)
        );

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL + "/v1/analyze/sentiment/batch"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(body, StandardCharsets.UTF_8))
                .build();

        HttpResponse<String> response = http.send(request, HttpResponse.BodyHandlers.ofString());

        return mapper.readValue(response.body(), BatchSentimentResponse.class);
    }
}
