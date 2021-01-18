package com.euler.problems;

import org.junit.Test;

/***
 * Test class for LongestCollatzSequence
 */
public class LongestCollatzSequenceTest {
    @Test
    public void testSequence() {
        long result = LongestCollatzSequence.getSequenceSize(13L);
        assert(result == 10);
    }

    @Test
    public void testLongSequence() {
        long longSeq = LongestCollatzSequence.getLongestSequence(10);
        assert(longSeq == 9L);
    }
}
