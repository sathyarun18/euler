package com.euler.problems;

/***
 * Euler project Problem #18 - Maximum path sum 1
 * This problem answers the maximum path sum as described in https://projecteuler.net/problem=18
 *
 */
public class MaximumPathSum {
    public static void main(String[] a) {
        //Input matrix provided in the question converted into a 2D matrix
        int[][] matrix = {
                {75},
                {95, 64},
                {17, 47, 82},
                {18, 35, 87, 10},
                {20, 4, 82, 47, 65},
                {19, 1, 23, 75, 3, 34},
                {88, 2, 77, 73, 7, 63, 67},
                {99, 65, 4, 28, 6, 16, 70, 92},
                {41, 41, 26, 56, 83, 40, 80, 70, 33},
                {41, 48, 72, 33, 47, 32, 37, 16, 94, 29},
                {53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14},
                {70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57},
                {91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48},
                {63, 66, 4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31},
                {4, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 4, 23}
        };
        System.out.println("The max path sum for the given matrix is " + maxPathSum(matrix));
    }

    /**
     * Starting from the bottom up (last but one row), this method finds the maximum sum
     * that can be formed at each element by adding the values of adjacent numbers in the next row.
     * Working to the top, the sum at the first element gives the result of the maximum sum
     * @param matrix Input represented in a 2D matrix
     * @return maximum path sum
     */
    public static int maxPathSum(int[][] matrix) {
        if(matrix.length ==  0) {
            return 0;
        }
        if(matrix.length < 2  ){
            return matrix[0][0];
        }
        for(int i  = matrix.length-2; i >=0; i--) {
            for(int j =0; j < matrix[i].length; j++) {
                matrix[i][j] += Math.max(matrix[i+1][j], matrix[i+1][j+1]);
            }
        }
        return matrix[0][0];
    }
}
