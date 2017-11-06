package ro.mindit.training.designpatterns.simuduck.testflow.scenarios;

import ro.mindit.training.designpatterns.simuduck.testflow.flows.LoginFlow;

public class LoginTest extends TestScenario {

    public LoginTest() {
        addFlow(new LoginFlow());
    }
}
