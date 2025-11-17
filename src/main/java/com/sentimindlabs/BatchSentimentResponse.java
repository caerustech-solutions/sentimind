package com.sentimindlabs;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class BatchSentimentResponse {

    private List<BatchResultItem> results;

    @JsonProperty("overall_sentiment")
    private String overallSentiment;

    @JsonProperty("positive_ratio")
    private double positiveRatio;

    @JsonProperty("negative_ratio")
    private double negativeRatio;

    public List<BatchResultItem> getResults() {
        return results;
    }

    public String getOverallSentiment() {
        return overallSentiment;
    }

    public double getPositiveRatio() {
        return positiveRatio;
    }

    public double getNegativeRatio() {
        return negativeRatio;
    }

    @Override
    public String toString() {
        return "BatchSentimentResponse{" +
                "results=" + results +
                ", overallSentiment='" + overallSentiment + '\'' +
                ", positiveRatio=" + positiveRatio +
                ", negativeRatio=" + negativeRatio +
                '}';
    }
}
