package ro.mindit.training.designpatterns.simuduck.ducks;

import ro.mindit.training.designpatterns.simuduck.behaviours.fly.NoFlyBehaviour;
import ro.mindit.training.designpatterns.simuduck.behaviours.quack.NoQuackBehaviour;

public class DecoyDuck extends DuckRedesigned {

    public DecoyDuck() {
        this.flyBehaviour = new NoFlyBehaviour();
        this.quackBehaviour = new NoQuackBehaviour();
    }


    @Override
    public String name() {
        return "Decoy Duck";
    }

    @Override
    public String display() {
        return "made of wood";
    }
}