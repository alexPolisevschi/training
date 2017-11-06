package ro.mindit.training.designpatterns.simuduck.testflow.flows;

import ro.mindit.training.designpatterns.simuduck.testflow.exceptions.IgnorableTestExecutionException;
import ro.mindit.training.designpatterns.simuduck.testflow.exceptions.TestExecutionException;

public class MinorBuggedFlow implements TestFlow {

    @Override
    public void execute() throws IgnorableTestExecutionException {
        throw new IgnorableTestExecutionException();
    }
}
