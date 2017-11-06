package ro.mindit.training.designpatterns.simuduck.testflow.flows;

import ro.mindit.training.designpatterns.simuduck.testflow.exceptions.TestExecutionException;

public interface TestFlow {

    void execute() throws TestExecutionException;


    default String getName() {
        return this.getClass().getSimpleName();
    };
}
