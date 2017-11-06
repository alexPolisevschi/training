package ro.mindit.training.designpatterns.simuduck.behaviours.quack;

public class SqueakBehaviour implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("SQUEAK");
    }
}
