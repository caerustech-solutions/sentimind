# 🧠 Sentimind Java SDK

Official **Java SDK for Sentimind Labs**, providing an easy interface to the **Sentimind Sentiment Analysis API**.  
Analyze text sentiment, tone, and market emotion with a few lines of Java code.

---

## 🚀 Overview

The **Sentimind SDK** allows developers to seamlessly integrate Sentimind’s AI-powered sentiment analysis into any Java application.  
It’s lightweight, fast, and requires zero configuration.

---

## ✨ Features

- ✅ **Simple setup** — Works instantly with Java 11+
- 💬 **Easy-to-use client** — Send text and receive structured sentiment results
- 🧩 **Batch support** — Analyze multiple sentences in one call
- 📊 **JSON-based responses** — Sentiment labels with confidence scores
- ⚡ **Lightweight** — Designed for microservices, bots, and data pipelines

---

## ⚙️ Installation

#### Download JAR file

1. Visit the **[Releases](https://github.com/caerustech-solutions/sentimind/releases)** page.
2. Download the latest `sentimind-sdk-<version>.jar` file.
3. Add it to your project’s **classpath**.

#### In IntelliJ IDEA:
- Open **File → Project Structure → Libraries → + → Java**
- Select the downloaded `.jar` file
- Click **Apply** and **OK**

Now you can import and use the `SentimindClient` class directly.

---

## 🧠 Example Usage

### Analyze single text
```java
import com.sentimind.client.SentimindClient;

public class Example {
    public static void main(String[] args) {
        SentimindClient client = new SentimindClient();
        String sentiment = client.analyzeSentiment("Market outlook remains strong for Q4 earnings.");
        System.out.println(sentiment);
    }
}
```

### Analyze multiple texts (batch mode)

```java
import java.util.List;
import com.sentimind.client.SentimindClient;

public class ExampleBatch {
    public static void main(String[] args) {
        SentimindClient client = new SentimindClient();
        List<String> texts = List.of(
            "The market is showing positive momentum.",
            "Investors are concerned about inflation data."
        );
        String result = client.analyzeBatch(texts);
        System.out.println(result);
    }
}
```

