package ro.mindit.training.algorithms.sort;

import ro.mindit.training.algorithms.sort.constants.Counter;
import ro.mindit.training.algorithms.sort.constants.SortingOrder;

import java.util.Arrays;

import static ro.mindit.training.algorithms.sort.constants.SortingOrder.ASCENDING;
import static ro.mindit.training.algorithms.sort.constants.SortingOrder.DESCENDING;

/**
 * Bubble sort, sometimes referred to as sinking sort, is a simple sorting algorithm that repeatedly steps through the list to be sorted,
 * compares each pair of adjacent items and swaps them if they are in the wrong order.
 * The pass through the list is repeated until no swaps are needed, which indicates that the list is sorted.
 *
 * The algorithm, which is a comparison sort, is named for the way smaller or larger elements "bubble" to the top of the list.
 * Although the algorithm is simple, it is too slow and impractical for most problems even when compared to insertion sort.
 *
 * Bubble sort has worst-case and average complexity both О(n^2)
 */
public class BubbleSort implements SortingAlgorithm {

    @Override
    public void sort(Integer[] array, SortingOrder sortingOrder) {
        System.out.println("\nInput: " + Arrays.toString(array));
        Counter counter = new Counter();

        iterateAndSwap(array, (array.length -1), sortingOrder, counter);

        System.out.println("Completed Bubble Sort using " + counter.getCount() + " operations. Output: " + Arrays.toString(array));
    }

    private void iterateAndSwap(Integer[] array, int upperLimit, SortingOrder sortingOrder, Counter counter) {
        int numberOfSwaps = 0;
        System.out.println("-- new loop");

        for (int i = 0; i < upperLimit; i++) {
            counter.increment();

            if ( (ASCENDING.equals(sortingOrder) && array[i+1] < array[i]) ||
                    (DESCENDING.equals(sortingOrder) && array[i+1] > array[i]) ) {

                swapElementsInArray(array, i, i+1, counter);
                numberOfSwaps++;

                System.out.println("-- -- swapped: " + Arrays.toString(array));
            }
        }

        // Exit condition: if no swaps were performed, the array is sorted.
        if (numberOfSwaps > 0) {
            // decrease the upper limit (in each iteration, the highest element reaches the right-most side)
            iterateAndSwap(array, upperLimit -1, sortingOrder, counter);
        }
    }
}
