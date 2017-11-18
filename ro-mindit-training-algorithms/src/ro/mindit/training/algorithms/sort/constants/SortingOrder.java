package ro.mindit.training.algorithms.sort.constants;

public enum SortingOrder {

    ASCENDING("nondecreasing"),
    DESCENDING("nonincreasing");


    String mathTerm;

    SortingOrder(String mathTerm) {
        this.mathTerm = mathTerm;
    }
}
