package ro.mindit.training.designpatterns.simuduck.behaviours.quack;

public class CommonQuackBehaviour implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("mac, mac");
    }
}
