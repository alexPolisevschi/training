package ro.mindit.training.algorithms.sort.constants;

public class Counter {

    private int count;


    public Counter() {
        count = 0;
    }


    public void increment() {
        count++;
    }

    public void incrementBy(int value) {
        count += value;
    }


    public int getCount() {
        return count;
    }

}
