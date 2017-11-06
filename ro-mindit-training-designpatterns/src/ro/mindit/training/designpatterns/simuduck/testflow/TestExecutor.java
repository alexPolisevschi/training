package ro.mindit.training.designpatterns.simuduck.testflow;

import ro.mindit.training.designpatterns.simuduck.testflow.scenarios.CreateAndSearchForPromotion;
import ro.mindit.training.designpatterns.simuduck.testflow.scenarios.CreateTwoPromotionsTestScenario;
import ro.mindit.training.designpatterns.simuduck.testflow.scenarios.LoginTest;
import ro.mindit.training.designpatterns.simuduck.testflow.scenarios.TestScenario;

import java.util.ArrayList;
import java.util.List;

public class TestExecutor {

    public static void main(String[] args) {
        List<TestScenario> scenariosToExecute = getTestsToExecute();

        scenariosToExecute.forEach(TestScenario::runTest);
    }

    private static List<TestScenario> getTestsToExecute() {
        // fetch the tests you want to run from somewhere (e.g. config/resource file)

        List<TestScenario> tests = new ArrayList<>();
        tests.add(new CreateTwoPromotionsTestScenario());
        tests.add(new CreateAndSearchForPromotion());
        tests.add(new LoginTest());
        return tests;
    }
}
