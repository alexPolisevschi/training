package ro.mindit.training.algorithms;

import ro.mindit.training.algorithms.sort.SelectionSort;
import ro.mindit.training.algorithms.sort.SortingAlgorithm;
import ro.mindit.training.algorithms.sort.constants.SortingOrder;

/**
 * A logarithm is the power to which a number must be raised in order to get some other number.
 * For example, the base ten logarithm of 100 is 2, because ten raised to the power of two is 100.
 *
 *      10^2 = 100 ->   log 100 = 2
 *       2^3 =   8 ->   lg 8 = 3
 */
public class AlgorithmRunner {

    public static void main(String[] args) {

        SortingAlgorithm sortingAlgorithm = new SelectionSort();

        sortingAlgorithm.sort(unsorted(), SortingOrder.ASCENDING);
        sortingAlgorithm.sort(sortedAscending(), SortingOrder.ASCENDING);
        sortingAlgorithm.sort(sortedDescending(), SortingOrder.ASCENDING);

//        sortingAlgorithm.sort(unsorted(), SortingOrder.DESCENDING);
//        sortingAlgorithm.sort(sortedAscending(), SortingOrder.DESCENDING);
//        sortingAlgorithm.sort(sortedDescending(), SortingOrder.DESCENDING);
    }


    private static Integer[] unsorted() {
        return new Integer[]{5, 2, 4, 6, 1, 3};
    }

    private static Integer[] sortedAscending() {
        return new Integer[]{1, 2, 3, 4, 5, 6};
    }

    private static Integer[] sortedDescending() {
        return new Integer[]{6, 5, 4, 3, 2, 1};
    }
}
