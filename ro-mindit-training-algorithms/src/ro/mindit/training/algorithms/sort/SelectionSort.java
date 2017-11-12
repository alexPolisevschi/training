package ro.mindit.training.algorithms.sort;

import ro.mindit.training.algorithms.sort.constants.SortingOrder;

import java.util.Arrays;

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

        recursiveFindAndSwap(array, 0, sortingOrder);
        System.out.println("Output: " + Arrays.toString(array));
    }

    private void recursiveFindAndSwap(Integer[] array, int index, SortingOrder sortingOrder) {
        if (index == array.length - 1) {
            // Exit condition.
            // Since the last element is already in place, the loop stops at [n-1]
            return;
        }

        int indexOfElementToSwap = DESCENDING.equals(sortingOrder) ?
                findHighestElementIndex(array, index) : findSmallestElementIndex(array, index);

        swapElementsInArray(array, index, indexOfElementToSwap);
        System.out.println("\t interim: " + Arrays.toString(array));

        recursiveFindAndSwap(array, index + 1, sortingOrder);
    }

    private int findSmallestElementIndex(Integer[] array, int startIndex) {
        int smallestElementIndex = startIndex;

        for (int i = startIndex; i < array.length - 1; i++) {
            if (array[i+1] < array[smallestElementIndex]) {
                smallestElementIndex = i + 1;
            }
        }
        return smallestElementIndex;
    }

    private int findHighestElementIndex(Integer[] array, int startIndex) {
        int highestElementIndex = startIndex;

        for (int i = startIndex; i < array.length - 1; i++) {
            if (array[i+1] > array[i]) {
                highestElementIndex = i + 1;
            }
        }
        return highestElementIndex;
    }

    private void swapElementsInArray(Integer[] array, int x, int y) {
        int elementAtIndex = array[x];
        array[x] = array[y];
        array[y] = elementAtIndex;
    }
}
