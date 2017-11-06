package ro.mindit.training.designpatterns.simuduck.testflow.scenarios;

import ro.mindit.training.designpatterns.simuduck.testflow.flows.CreatePromotionFlow;
import ro.mindit.training.designpatterns.simuduck.testflow.flows.LoginFlow;
import ro.mindit.training.designpatterns.simuduck.testflow.flows.MinorBuggedFlow;
import ro.mindit.training.designpatterns.simuduck.testflow.flows.SearchPromotionFlow;

public class CreateAndSearchForPromotion extends TestScenario {

    public CreateAndSearchForPromotion() {
        addFlow(new LoginFlow());
        addFlow(new CreatePromotionFlow());
        addFlow(new MinorBuggedFlow());
        addFlow(new SearchPromotionFlow());
    }
}
