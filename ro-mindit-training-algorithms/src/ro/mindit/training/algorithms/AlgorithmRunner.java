package ro.mindit.training.algorithms;

import ro.mindit.training.algorithms.sort.InsertionSort;
import ro.mindit.training.algorithms.sort.SortingAlgorithm;

/**
 * A logarithm is the power to which a number must be raised in order to get some other number.
 * For example, the base ten logarithm of 100 is 2, because ten raised to the power of two is 100.
 *
 *      10^2 = 100 ->   log 100 = 2
 *       2^3 =   8 ->   lg 8 = 3
 */
public class AlgorithmRunner {

    public static void main(String[] args) {

        SortingAlgorithm sortingAlgorithm = new InsertionSort();

        sortingAlgorithm.sort(unsorted());
        sortingAlgorithm.sort(sortedAscending());
        sortingAlgorithm.sort(sortedDescending());
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
