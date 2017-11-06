package ro.mindit.training.designpatterns.simuduck.ducks;

import ro.mindit.training.designpatterns.simuduck.behaviours.fly.FlyBehaviour;
import ro.mindit.training.designpatterns.simuduck.behaviours.quack.QuackBehaviour;

public abstract class DuckRedesigned {

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;


    public abstract String name();

    public abstract String display();


    public void swim() {
        System.out.println(name() + " inoata.");
    }

    public void lookGood() {
        System.out.println(name() + " arata excelent, ca de obicei");
    }


    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }


    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

}
