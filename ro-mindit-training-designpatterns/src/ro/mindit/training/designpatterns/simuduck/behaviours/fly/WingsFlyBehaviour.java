package ro.mindit.training.designpatterns.simuduck.behaviours.fly;

public class WingsFlyBehaviour implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("uses wings to fly");
    }
}
