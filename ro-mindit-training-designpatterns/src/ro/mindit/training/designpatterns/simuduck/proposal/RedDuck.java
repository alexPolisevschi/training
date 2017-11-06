package ro.mindit.training.designpatterns.simuduck.proposal;

import ro.mindit.training.designpatterns.simuduck.ducks.DuckRedesigned;


public class RedDuck extends DuckRedesigned implements Quackable, Flyable {

    @Override
    public String name() {
        return "Rata Rosie";
    }

    @Override
    public String display() {
        return "De fapt, doar capul e rosu.";
    }

    @Override
    public void fly() {
        System.out.println("Zboara dand din aripi o data pe secunda.");
    }

    @Override
    public void quack() {
        System.out.println("maaac");
    }
}
