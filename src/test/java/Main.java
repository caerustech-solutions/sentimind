import com.sentimindlabs.*;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        SentimindClient client = new SentimindClient();

        // Test single
        SingleSentimentResponse single = client.analyzeSentiment(
                "Something is wrong with the company, the stock is collapsing"
        );
        System.out.println(single);

        // Test batch
        BatchSentimentResponse batch = client.analyzeBatchSentiment(
                List.of(
                        "The stock is going down fast",
                        "Maybe it is not as bad as we thought it would be, might gain some",
                        "Nah, the company is done. Kaput!"
                )
        );
        System.out.println(batch);

    }
}