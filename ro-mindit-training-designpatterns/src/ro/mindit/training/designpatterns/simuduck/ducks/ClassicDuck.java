package ro.mindit.training.designpatterns.simuduck.ducks;

public class ClassicDuck extends Duck {

    @Override
    String name() {
        return "Rata de balta";
    }

    @Override
    public String display() {
        return "Green head, two legs, normal duck-like colors";
    }
}
