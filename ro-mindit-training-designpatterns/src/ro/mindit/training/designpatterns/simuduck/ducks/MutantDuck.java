package ro.mindit.training.designpatterns.simuduck.ducks;

public class MutantDuck extends Duck {

    @Override
    String name() {
        return "X-Duck";
    }

    @Override
    public String display() {
        return "Two heads, three legs, breathes fire.";
    }
}
