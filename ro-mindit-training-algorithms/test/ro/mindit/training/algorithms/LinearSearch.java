package ro.mindit.training.algorithms;

import org.junit.Test;

import java.util.List;

public class LinearSearch {

    /**
     * Input: A sequence of n numbers A = {a1, a2, ..., an} and a value v.
     * Output: An index i such that v = A[i] or the special value NULL if v does not appear in A.
     */
    @Test
    public void testLinearSearch() {
        //
    }


    /**
     * Stop condition A[i] = v.
     * If the stop condition applies for the first element, we never enter the loop.
     *
     * Loop invariant: A [1... i-1]
     * - initialization: the first element does not contain value v
     * - maintenance: all elements in A [1... i-1] do not contain value v
     * - termination: verify that A[i] = v  (or that i = n and result is null)
     */
    private Integer linearSearch(List<Integer> list, int value) {
        if (value == list.get(0)) {
            return 0;
        }

        for (int i = 1; i < list.size(); i++) {
            if (value == list.get(i)) {
                return i;
            }
        }
        return null;
    }

}
