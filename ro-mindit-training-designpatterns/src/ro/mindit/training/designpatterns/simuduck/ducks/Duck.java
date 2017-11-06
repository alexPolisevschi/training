package ro.mindit.training.designpatterns.simuduck.ducks;

public abstract class Duck {

    public void quack() {
        System.out.println(name() + ": mac mac!!!");
    }

    public void swim() {
        System.out.println(name() + " inoata.");
    }

    public void fly() {
        System.out.println(name() + " se ridica in aer si incepe sa zboare!");
    }

    public void looksGood() {
        System.out.println(name() + " arata excelent, ca de obicei");
    }


    abstract String name();

    public abstract String display();
}
