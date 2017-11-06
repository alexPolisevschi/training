package ro.mindit.training.designpatterns.simuduck.proposal;

import ro.mindit.training.designpatterns.simuduck.ducks.DuckRedesigned;


public class BlueDuck extends DuckRedesigned implements Quackable, Flyable {

    @Override
    public String name() {
        return "Rata Albastra";
    }

    @Override
    public String display() {
        return "O rata obisnuita, cu coada albastra";
    }


    @Override
    public void fly() {
        System.out.println("Zboara dand din aripi o data pe secunda.");
    }
}
