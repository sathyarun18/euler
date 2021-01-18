package com.euler.problems;

import org.junit.Test;

import java.math.BigInteger;

/**
 * Test class for the factorial sum
 */
public class FactorialSumTest {

    @Test
    public void testFactorial(){
        BigInteger result = FactorialSum.factorial(10);
        assert (result.equals(BigInteger.valueOf(3628800)));
    }

    @Test
    public void testFactorialSum(){
        assert(FactorialSum.sumOfDigits(FactorialSum.factorial(10)) == 27);
    }

    @Test
    public void testFactorialBoundary() {
        BigInteger result =  FactorialSum.factorial(0);
        assert(result.equals(BigInteger.ONE));
    }
}
