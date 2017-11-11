package ro.mindit.training.algorithms.sort;

import ro.mindit.training.algorithms.sort.constants.SortingOrder;

import java.util.Collection;
import java.util.List;

/**
 * Complexity: c2 * (n * lg n)
 *
 * For large numbers, MergeSort is more efficient than InsertionSort.
 */
public class MergeSort implements SortingAlgorithm {

    @Override
    public <E extends Comparable<E>> List<E> computeSortedList(Collection<E> collectionToSort) {
        return null;
    }

    @Override
    public <E extends Comparable<E>> void sort(List<E> collectionToSort, SortingOrder sortingOrder) {
        //
    }
}
