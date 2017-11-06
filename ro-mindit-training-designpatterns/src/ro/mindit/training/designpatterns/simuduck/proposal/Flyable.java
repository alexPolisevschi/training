package ro.mindit.training.designpatterns.simuduck.proposal;

public interface Flyable {

    default void fly() {
        System.out.println("flying");
    };
}
