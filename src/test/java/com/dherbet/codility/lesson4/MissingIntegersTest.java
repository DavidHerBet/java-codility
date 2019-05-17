package com.dherbet.codility.lesson4;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MissingIntegersTest {

    private static MissingIntegers missingIntegers;

    @BeforeClass
    public static void setUp() {
        missingIntegers = new MissingIntegers();
    }

    @Test
    public void problemProvidedInputs() {
        assertEquals(5, missingIntegers.solution(new int[]{1, 3, 6, 4, 1, 2}));
        assertEquals(4, missingIntegers.solution(new int[]{1,2,3}));
        assertEquals(1, missingIntegers.solution(new int[]{-1,-3}));
    }

}