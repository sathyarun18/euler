package com.euler.problems;

import java.math.BigInteger;

/**
 * Euler project Problem #20 - Factorial Digit Sum
 * Finding the sum of digits of factorial for the given number. (100 in this case)
 */
public class FactorialSum {

    public static void main(String[] a) {
        BigInteger result = factorial(100);
        System.out.println("Factorial of the given number is " + result);
        System.out.println("Sum of the digits in the factorial is " + sumOfDigits(result));
    }

    /**
     * Determines the factorial of the given number
     * @param number input integer
     * @return BigInteger that holds the factorial result
     */
    public static BigInteger factorial(int number) {
        if(number <= 1) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(number).multiply(factorial(number-1));
    }

    /**
     * Computing sum of the digits in the factorial number
     * @param result Factorial result
     * @return sum of the digits
     */
    public static int sumOfDigits(BigInteger result) {
        String factResult = result.toString();
        int sum = 0;
        for(int i =0; i< factResult.length(); i++) {
            sum += factResult.charAt(i) - '0';
        }
        return sum;
    }
}
