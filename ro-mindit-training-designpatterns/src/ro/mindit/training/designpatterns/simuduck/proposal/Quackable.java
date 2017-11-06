package ro.mindit.training.designpatterns.simuduck.proposal;

public interface Quackable {

    default void quack() {
        System.out.println("quacking");
    };
}
