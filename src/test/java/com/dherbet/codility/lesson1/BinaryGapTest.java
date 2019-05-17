package com.dherbet.codility.lesson1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryGapTest {

    private static final BinaryGap binaryGap = new BinaryGap();

    @Test
    public void problemProvidedInputs() {
        assertEquals(2, binaryGap.solution(9));
        assertEquals(4, binaryGap.solution(529));
        assertEquals(1, binaryGap.solution(20));
        assertEquals(0, binaryGap.solution(15));
        assertEquals(0, binaryGap.solution(32));
        assertEquals(5, binaryGap.solution(1041));
    }

}