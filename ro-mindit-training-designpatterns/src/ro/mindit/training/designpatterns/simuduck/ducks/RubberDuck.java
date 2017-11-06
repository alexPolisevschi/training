package ro.mindit.training.designpatterns.simuduck.ducks;

public class RubberDuck extends Duck {

    @Override
    String name() {
        return "Rata de cauciuc (aia din cada!)";
    }

    @Override
    public String display() {
        return "Galbana, din plastic";
    }


    @Override
    public void quack() {
        System.out.println("squeak, squeak!");
    }


    @Override
    public void fly() {
        System.out.println("does nothing");
    }
    // override fly() to do nothing
}
