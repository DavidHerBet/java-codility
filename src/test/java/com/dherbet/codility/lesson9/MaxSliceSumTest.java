package com.dherbet.codility.lesson9;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxSliceSumTest {

    private static MaxSliceSum maxSliceSum;

    @BeforeClass
    public static void setUp() {
        maxSliceSum = new MaxSliceSum();
    }

    @Test
    public void problemProvidedInputs() {
        assertEquals(5, maxSliceSum.solution(new int[]{3,2,-6,4,0}));
    }

}