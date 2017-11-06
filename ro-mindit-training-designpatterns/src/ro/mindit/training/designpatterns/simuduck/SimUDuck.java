package ro.mindit.training.designpatterns.simuduck;

import ro.mindit.training.designpatterns.simuduck.behaviours.fly.JetPackFlyBehaviour;
import ro.mindit.training.designpatterns.simuduck.ducks.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SimUDuck {

    public static void main(String[] args) {

        System.out.println("Welcome to the awesome duck simulator console application, where you can observe ducks " +
                "\nin a simulated environment.");

//        List<Duck> duckList = new ArrayList<>();
//        duckList.add(new ClassicDuck());
//        duckList.add(new MutantDuck());
//        duckList.add(new RubberDuck());

        List<DuckRedesigned> redesignedList = new ArrayList<>();
        redesignedList.add(new DecoyDuck());
        redesignedList.add(new DecoyDuck());
        redesignedList.add(new DecoyDuck());
        redesignedList.add(new DecoyDuck());

        redesignedList.forEach(SimUDuck::simulate);
    }

    private static void simulate(DuckRedesigned duck) {

        Random random = new Random();
        boolean foundJetpack = random.nextBoolean();

        duck.performQuack();
        duck.swim();

        if (foundJetpack) {
            duck.setFlyBehaviour(new JetPackFlyBehaviour());
        }
        duck.performFly();

        System.out.println();
    }
}
