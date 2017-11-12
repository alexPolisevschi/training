package ro.mindit.training.algorithms.sort;

import ro.mindit.training.algorithms.sort.constants.Counter;
import ro.mindit.training.algorithms.sort.constants.SortingOrder;

public interface SortingAlgorithm {

    /**
     * Do what the book says.. sort an array of Integers!!
     */
    void sort(Integer[] array, SortingOrder sortingOrder);


    /**
     * Swap elements at positions x and y in the given array.
     * If an operations counter was provided, increment it.
     */
    default void swapElementsInArray(Integer[] array, int x, int y, Counter counter) {
        int elementAtIndex = array[x];
        array[x] = array[y];
        array[y] = elementAtIndex;

        if (counter != null) {
            counter.increment();
        }
    }
}
