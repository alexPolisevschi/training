package ro.mindit.training.algorithms;

import ro.mindit.training.algorithms.sort.InsertionSort;
import ro.mindit.training.algorithms.sort.SortingAlgorithm;
import ro.mindit.training.algorithms.sort.constants.SortingOrder;

import java.util.ArrayList;
import java.util.List;

/**
 * A logarithm is the power to which a number must be raised in order to get some other number.
 * For example, the base ten logarithm of 100 is 2, because ten raised to the power of two is 100.
 *
 *      10^2 = 100 ->   log 100 = 2
 *       2^3 =   8 ->   lg 8 = 3
 *
 *
 */
public class AlgorithmRunner {

    public static void main(String[] args) {

        SortingAlgorithm sortingAlgorithm = new InsertionSort();

        sortingAlgorithm.sort(unsorted(), SortingOrder.DESCENDING);
        sortingAlgorithm.sort(sortedAscending(), SortingOrder.DESCENDING);
        sortingAlgorithm.sort(sortedDescending(), SortingOrder.DESCENDING);
    }


    private static List<Integer> unsorted() {
        List<Integer> elements = new ArrayList<>();
        elements.add(5);
        elements.add(2);
        elements.add(4);
        elements.add(6);
        elements.add(1);
        elements.add(3);
        return elements;
    }

    private static List<Integer> sortedAscending() {
        List<Integer> elements = new ArrayList<>();
        elements.add(1);
        elements.add(2);
        elements.add(3);
        elements.add(4);
        elements.add(5);
        elements.add(6);
        return elements;
    }

    private static List<Integer> sortedDescending() {
        List<Integer> elements = new ArrayList<>();
        elements.add(6);
        elements.add(5);
        elements.add(4);
        elements.add(3);
        elements.add(2);
        elements.add(1);
        return elements;
    }
}
