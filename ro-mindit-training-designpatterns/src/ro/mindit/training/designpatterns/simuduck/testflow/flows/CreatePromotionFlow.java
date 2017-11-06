package ro.mindit.training.designpatterns.simuduck.testflow.flows;

public class CreatePromotionFlow implements TestFlow {

    @Override
    public void execute() {
        System.out.println("create a new promotion");
    }
}
