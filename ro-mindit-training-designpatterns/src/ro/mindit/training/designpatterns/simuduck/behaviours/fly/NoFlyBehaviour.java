package ro.mindit.training.designpatterns.simuduck.behaviours.fly;

public class NoFlyBehaviour implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("cannot fly");
    }
}
