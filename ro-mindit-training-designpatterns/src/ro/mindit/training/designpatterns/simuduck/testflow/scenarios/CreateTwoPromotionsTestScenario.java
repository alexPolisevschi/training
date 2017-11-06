package ro.mindit.training.designpatterns.simuduck.testflow.scenarios;

import ro.mindit.training.designpatterns.simuduck.testflow.flows.BuggedFlow;
import ro.mindit.training.designpatterns.simuduck.testflow.flows.CreatePromotionFlow;
import ro.mindit.training.designpatterns.simuduck.testflow.flows.LoginFlow;

public class CreateTwoPromotionsTestScenario extends TestScenario {

    public CreateTwoPromotionsTestScenario() {
        addFlow(new LoginFlow());

        addFlow(new BuggedFlow());
        addFlow(new CreatePromotionFlow());
        addFlow(new CreatePromotionFlow());
    }
}
