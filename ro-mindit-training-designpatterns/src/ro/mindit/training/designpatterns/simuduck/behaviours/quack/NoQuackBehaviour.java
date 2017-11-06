package ro.mindit.training.designpatterns.simuduck.behaviours.quack;

import ro.mindit.training.designpatterns.simuduck.proposal.Quackable;

public class NoQuackBehaviour implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("silence.. ");
    }
}
