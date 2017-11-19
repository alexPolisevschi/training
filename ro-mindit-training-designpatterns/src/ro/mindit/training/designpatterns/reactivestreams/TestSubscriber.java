package ro.mindit.training.designpatterns.reactivestreams;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Flow;

/**
 * Observer and Observable are deprecated
 * - some of the reasons (not serializable, observable was not an interface, not thread safe)
 *
 * There are many alternatives of Observer design pattern and Reactive Streams is one of them.
 */
public class TestSubscriber<T> implements Flow.Subscriber<T> {

    // Subscription: a class that is used to control the flow of messages between Subscriber and the Publisher
    private Flow.Subscription subscription;

    public List<T> consumedElements = new LinkedList<>();


    // called before processing starts
    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        subscription.request(1);
    }

    // called whenever the Publisher publishes a new message
    @Override
    public void onNext(T item) {
        System.out.println("Got : " + item);
        subscription.request(1);
    }

    @Override
    public void onError(Throwable throwable) {
        throwable.printStackTrace();
    }


    // called when the Publisher is closed
    @Override
    public void onComplete() {
        System.out.println("Done");
    }
}
