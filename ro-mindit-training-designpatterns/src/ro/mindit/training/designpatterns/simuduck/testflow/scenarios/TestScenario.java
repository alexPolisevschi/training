package ro.mindit.training.designpatterns.simuduck.testflow.scenarios;

import ro.mindit.training.designpatterns.simuduck.testflow.exceptions.IgnorableTestExecutionException;
import ro.mindit.training.designpatterns.simuduck.testflow.exceptions.TestExecutionException;
import ro.mindit.training.designpatterns.simuduck.testflow.flows.TestFlow;

import java.util.ArrayList;
import java.util.List;

public abstract class TestScenario {

    private List<TestFlow> flows;


    void addFlow(TestFlow flow) {
        if (flows == null ) {
            flows = new ArrayList<>();
        }
        flows.add(flow);
    }

    public void listFlowsInOrder() {
        flows.forEach(TestFlow::getName);
    }


    public void runTest() {
        System.out.println();

        for (TestFlow flow : flows) {
            // you could track the flows executed so far, and log them later, up to the step that failed
            try {
                flow.execute();

            } catch (IgnorableTestExecutionException e) {
                System.out.println("Warning: '" + flow.getName() + "' flow failed, but we can continue with the rest.");
                // send email
                // open bug in jira.. etc

            } catch (TestExecutionException e) {
                System.out.println("Test failed at flow '" + flow.getName() + "'. Stopping execution.");
                // send email
                // open bug in jira.. etc
                return;
            }
        }
    }
}
