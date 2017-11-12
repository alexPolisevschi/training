package ro.mindit.training.algorithms.sort;

import ro.mindit.training.algorithms.sort.constants.Counter;
import ro.mindit.training.algorithms.sort.constants.SortingOrder;

import java.util.Arrays;

import static ro.mindit.training.algorithms.sort.constants.SortingOrder.ASCENDING;
import static ro.mindit.training.algorithms.sort.constants.SortingOrder.DESCENDING;

/**
 * 2.2-2 - Selection Sort
 *
 * Consider sorting n numbers stored in array A by first finding the smallest element of A and exchanging it with
 * the element in A[1]. Then find the second smallest element of A, and exchange it with A[2].
 * Continue in this manner for the first n-1 elements of A.
 *
 * - What loop invariant does this algorithm maintain?
 * - Why does it need to run for only the first n-1 elements, rather than for all n elements?
 * - Give the best-case and worst-case running times of selection sort in big O notation.
 *
 * Complexity: O(n^2)
 *
 * Insertion sort's advantage is that it only scans as many elements as it needs in order to place the k + 1st element,
 * while selection sort must scan all remaining elements to find the k + 1st element.
 */
public class SelectionSort implements SortingAlgorithm {

    @Override
    public void sort(Integer[] array, SortingOrder sortingOrder) {
        System.out.println("\nInput: " + Arrays.toString(array));
        Counter counter = new Counter();

        recursiveFindAndSwap(array, 0, sortingOrder, counter);

        System.out.println("Completed selective sort using " + counter.getCount() + " operations. Output: " + Arrays.toString(array));
    }

    private void recursiveFindAndSwap(Integer[] array, int index, SortingOrder sortingOrder, Counter counter) {
        if (index == array.length - 1) {
            // Exit condition.
            // Since the last element is already in place, the loop stops at [n-1]
            return;
        }

        int indexOfElementToSwap = findElementToSwap(array, index, sortingOrder, counter);

        if (index != indexOfElementToSwap) {
            swapElementsInArray(array, index, indexOfElementToSwap, counter);
        }
        System.out.println("-- swapped (index " + index + "): " + Arrays.toString(array));

        recursiveFindAndSwap(array, index + 1, sortingOrder, counter);
    }

    /**
     * Based on the specified sorting order, finds either the smallest or the highest element in the array,
     * starting from the given startIndex.
     * Swaps the element at startIndex with the highest/lowest element.
     */
    private int findElementToSwap(Integer[] array, int startIndex, SortingOrder sortingOrder, Counter counter) {
        int indexOfElementToSwap = startIndex;

        for (int i = startIndex; i < array.length - 1; i++) {
            counter.increment();

            if ( (ASCENDING.equals(sortingOrder) && array[i+1] < array[indexOfElementToSwap]) ||
                    (DESCENDING.equals(sortingOrder) && array[i+1] > array[indexOfElementToSwap])) {
                indexOfElementToSwap = i + 1;
            }
        }
        return indexOfElementToSwap;
    }

    private void swapElementsInArray(Integer[] array, int x, int y, Counter counter) {
        int elementAtIndex = array[x];
        array[x] = array[y];
        array[y] = elementAtIndex;

        counter.increment();
    }
}
