package com.euler.problems;

import java.util.ArrayList;
import java.util.List;

/***
 * Euler project Problem #14 - Longest Collatz Sequence
 * This problem determines the longest collatz sequence as explained in the
 * https://projecteuler.net/problem=14
 */
public class LongestCollatzSequence {

    public static void main(String[] a) {
        System.out.println("The longest collatz chain is produced by 4" + getLongestSequence(1000000));
    }

    /***
     * Returns the longest sequence that can be formed given the input
     * @param number input given
     * @return result of longest sequence that can be formed below the input specified
     */
    public static long getLongestSequence(int number) {
        int largest = 0;
        long result = 0;
        for(long i = 1L; i < number; i++) {
            //Gets the sequence size for every number below the input and updates the largest value
            int sequenceSize = getSequenceSize(i);
            if(sequenceSize > largest){
                largest = sequenceSize;
                result = i;
            }
        }
        return result;
    }

    /***
     * Main function that calibrates the sequence size for the given number
     * @param input input for which the collatz sequence is calculated
     * @return number of terms in the collatz sequence
     */
    public static int getSequenceSize(long input) {
        //Int that helps in storing the sequence to calculate the size
        int collatzSize = 0;
        while(input != 1) {
            collatzSize++;
            if(input %2 == 0) {
                input = input /2;
            } else {
                input = 3 * input +1;
            }
        }
        //Size + 1 since 1 is the last term to be included in the sequence
        return collatzSize+1;
    }
}
