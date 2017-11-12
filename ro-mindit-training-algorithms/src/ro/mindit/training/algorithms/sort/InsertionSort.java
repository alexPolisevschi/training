package ro.mindit.training.algorithms.sort;

import ro.mindit.training.algorithms.sort.constants.SortingOrder;

import java.util.Arrays;

import static ro.mindit.training.algorithms.sort.constants.SortingOrder.ASCENDING;
import static ro.mindit.training.algorithms.sort.constants.SortingOrder.DESCENDING;

/**
 * Insertion sort is an efficient algorithm for sorting a small number of elements.
 *
 * Insertion sort works the way many people sort a hand of playing cards.
 *
 * We start with an empty left hand and the cards face down on the table. We then remove one card at a time from the
 * table and insert it into the correct position in the left hand. To find the correct position for a card, we compare
 * it with each of the cards already in the hand, from right to left.
 *
 * At all times, the cards held in the left hand are sorted, and these cards were originally the top cards of
 * the pile on the table.
 *
 * Complexity: c1 * n^2
 */
public class InsertionSort implements SortingAlgorithm {

    @Override
    public void sort(Integer[] array, SortingOrder sortingOrder) {
        System.out.println("\nInput: " + Arrays.toString(array));
        int numberOfOperations = 0;

        // the first element stays in place, start the algorithm with the second
        for (int j = 1; j < array.length; j++) {
            numberOfOperations++;
            int elementToMove = array[j];

            /* Loop through all the elements before the current one: A[1... j-1]
             * - start from the previous element (at [j-1] position) - if it's higher, shift it one position to the right
             * - continue until you find an element that is higher than elementToMove, or until you reach the beginning of the array
             */
            int i = j - 1;
            while (i >= 0 && ( (array[i] > elementToMove && ASCENDING.equals(sortingOrder))
                                || (array[i] < elementToMove && DESCENDING.equals(sortingOrder)))) {
                array[i + 1] = array[i];
                i--;

                numberOfOperations++;
                System.out.println("-- intermediate: " + Arrays.toString(array));
            }

            // put the elementToMove in it's new position (i + 1 because the previous loop does i--)
            array[i + 1] = elementToMove;
            System.out.println("-- intermediate: " + Arrays.toString(array));
        }

        System.out.println("Sorted the array using " + numberOfOperations + " operations. Result: " + Arrays.toString(array));
    }

}
