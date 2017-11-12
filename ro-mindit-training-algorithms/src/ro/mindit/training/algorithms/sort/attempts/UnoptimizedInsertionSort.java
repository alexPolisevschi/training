package ro.mindit.training.algorithms.sort.attempts;

import ro.mindit.training.algorithms.sort.constants.SortingOrder;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import static ro.mindit.training.algorithms.sort.constants.SortingOrder.ASCENDING;
import static ro.mindit.training.algorithms.sort.constants.SortingOrder.DESCENDING;

/**
 * My first attempts at writing Insertion Sort without looking at the solution in the book.
 *
 * Realised it's flawed, for several reasons:
 * - does more element shifting than necessary, by using both list.remove() and list.add()
 * - the count of operations was too high for an already sorted array
 */
public class UnoptimizedInsertionSort {

    /**
     * Sorts in place a list of elements.
     */
    public <E extends Comparable<E>> void sort(List<E> list, SortingOrder sortingOrder) {
        System.out.println("\nInput:" + list);
        int numberOfOperations = 0;

        // the first element stays in place, start the algorithm with the second
        for (int i = 1; i < list.size(); i++) {
            numberOfOperations++;
            numberOfOperations += compareAndMoveElement(list, i, sortingOrder);
            System.out.println("\t position (" + i + "): " + list + ". Number of operations: " + numberOfOperations);
        }
    }

    /**
     * Compare the element at the indicated position with all the elements before it, knowing that all elements before
     * it are sorted in order.
     * When iterating, if an element is found that is higher/lower than the position-element, move the position-element
     * before it. Otherwise, nothing happens (the position-element stays in place).
     */
    private <E extends Comparable<E>> int compareAndMoveElement(List<E> list, int position, SortingOrder sortingOrder) {
        int numberOfOperations = 0;

        E elementToMove = list.get(position);

        for (int i = 0; i < position; i++) {
            numberOfOperations++;

            E current = list.get(i);
            if ( (ASCENDING.equals(sortingOrder) && elementToMove.compareTo(current) < 0)
                    || DESCENDING.equals(sortingOrder) && elementToMove.compareTo(current) > 0) {

                list.remove(position);  // shifts all to the left
                numberOfOperations += list.size() - position + 1;

                list.add(i, elementToMove); // shifts all to the right
                numberOfOperations += position;

                break;
            }
        }
        return numberOfOperations;
    }



    /** Sorts a collection of comparable elements;
     * @return a list containing all the elements of the original collection, sorted.
     *
     * Input: A sequence of n numbers a1, a2, ... an
     * Output: A permutation (reordering) b1, b2, ... b2 of the input sequence, such that b1 <= b2 <= ... <= bn
     */
    public <E extends Comparable<E>> List<E> computeSortedList(Collection<E> collectionToSort) {
        final int[] count = {0};

        List<E> sortedList = new LinkedList<>();
        collectionToSort.forEach(element -> {
            count[0] = count[0] + insertInOrder(sortedList, element);
        });

        System.out.println("Created a new, sorted, list using " + count[0] + " operations");
        return sortedList;
    }

    private <E extends Comparable<E>> int insertInOrder(List<E> sortedList, E newElement) {
        int numberOfOperations = 1;

        if (sortedList.isEmpty()) {
            sortedList.add(newElement);
            return numberOfOperations;
        }

        for (int i = 0; i < sortedList.size(); i++) {
            numberOfOperations++;
            E current = sortedList.get(i);

            if (newElement.compareTo(current) < 0) {
                sortedList.add(i, newElement);
                return numberOfOperations;
            }
        }

        sortedList.add(newElement);
        return numberOfOperations;
    }
}
