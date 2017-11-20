package ro.mindit.training.designpatterns.reactivestreams;

import java.time.Instant;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;
import java.util.function.Function;

import static java.lang.Thread.sleep;

public class ReactiveApp {

    public static void main(String[] args) throws InterruptedException {

        SubmissionPublisher<String> publisher = new SubmissionPublisher<>();

        TransformProcessor<String, String> transformProcessor = new TransformProcessor<>(stringLimiter());
        publisher.subscribe(transformProcessor);

        Flow.Subscriber<String> aSubscriber = new ASubscriber<>();
        transformProcessor.subscribe(aSubscriber);

        Flow.Subscriber<String> bSubscriber = new BSubscriber();
        publisher.subscribe(bSubscriber);

        long finish = Instant.now().getEpochSecond() + 20;
        while(Instant.now().getEpochSecond() < finish) {
            publisher.submit(getItem());
            sleep(1000);
        }

        publisher.close();
        sleep(2000);
    }

    private static Function<String, String> stringLimiter() {
        return s -> {
            if (s != null && s.length() >= 10) {
                s = s.substring(0, 9);
            }
            return s;
        };
    }

    private static String getItem() {
        String randomString = UUID.randomUUID().toString();

        Random rn = new Random();
        int randomInt = rn.nextInt(10) + 1;
        if (randomInt == 3) {
            randomString += " bomb!";
        }
        return randomString;
    }
}
