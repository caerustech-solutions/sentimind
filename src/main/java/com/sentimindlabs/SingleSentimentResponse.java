package com.sentimindlabs;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SingleSentimentResponse {

    @JsonProperty("input_text")
    private String inputText;

    private String sentiment;
    private double confidence;

    public String getInputText() {
        return inputText;
    }

    public String getSentiment() {
        return sentiment;
    }

    public double getConfidence() {
        return confidence;
    }

    @Override
    public String toString() {
        return "SingleSentimentResponse{" +
                "inputText='" + inputText + '\'' +
                ", sentiment='" + sentiment + '\'' +
                ", confidence=" + confidence +
                '}';
    }
}
