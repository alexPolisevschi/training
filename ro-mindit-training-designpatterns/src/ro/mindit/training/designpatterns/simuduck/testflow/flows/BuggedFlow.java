package ro.mindit.training.designpatterns.simuduck.testflow.flows;

import ro.mindit.training.designpatterns.simuduck.testflow.exceptions.TestExecutionException;

public class BuggedFlow implements TestFlow {

    @Override
    public void execute() throws TestExecutionException {
        throw new TestExecutionException();
    }
}
