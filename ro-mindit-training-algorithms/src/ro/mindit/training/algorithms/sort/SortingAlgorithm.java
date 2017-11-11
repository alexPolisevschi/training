package ro.mindit.training.algorithms.sort;

import ro.mindit.training.algorithms.sort.constants.SortingOrder;

import java.util.Collection;
import java.util.List;

public interface SortingAlgorithm {

    /**
     * Sorts in place a list of elements.
     */
    <E extends Comparable<E>> void sort(List<E> collectionToSort, SortingOrder sortingOrder);


    /**
     * Sorts a collection of comparable elements;
     * @return a list containing all the elements of the original collection, sorted.
     *
     * Input: A sequence of n numbers a1, a2, ... an
     * Output: A permutation (reordering) b1, b2, ... b2 of the input sequence, such that b1 <= b2 <= ... <= bn
     */
    <E extends Comparable<E>> List<E> computeSortedList(Collection<E> collectionToSort);

}
