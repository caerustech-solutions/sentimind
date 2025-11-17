package com.sentimindlabs;

public class BatchResultItem {

    private String text;
    private String sentiment;
    private double confidence;

    public String getText() {
        return text;
    }

    public String getSentiment() {
        return sentiment;
    }

    public double getConfidence() {
        return confidence;
    }

    @Override
    public String toString() {
        return "BatchResultItem{" +
                "text='" + text + '\'' +
                ", sentiment='" + sentiment + '\'' +
                ", confidence=" + confidence +
                '}';
    }
}
