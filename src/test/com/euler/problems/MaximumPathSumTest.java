package com.euler.problems;

import org.junit.Test;

/***
 * Test class for the maximum path sum
 */
public class MaximumPathSumTest {

    @Test
    public void testMaxPathSum(){
        int[][] input = new int[][] {
                {3},
                {7, 4},
                {2, 4, 6},
                {8, 5, 9, 3}
        };
        assert(MaximumPathSum.maxPathSum(input) == 23);
    }

    @Test
    public void testMaxPathSumEmpty() {
        assert(MaximumPathSum.maxPathSum(new int[][]{}) == 0);
    }

    @Test
    public void testMaxPathSumOneRow() {
        int[][] test = {
                {5}
        };
        assert(MaximumPathSum.maxPathSum(test) == 5);
    }

    @Test
    public void testMaxPathSumSmall() {
        int[][] test = {
                {1},
                {2,3}
        };
        assert(MaximumPathSum.maxPathSum(test) == 4);
    }
}
