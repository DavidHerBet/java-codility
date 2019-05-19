package com.dherbet.codility.lesson5;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinAvgTwoSliceTest {

    private static MinAvgTwoSlice minAvgTwoSlice;

    @BeforeClass
    public static void setUp() {
        minAvgTwoSlice = new MinAvgTwoSlice();
    }

    @Test
    public void problemProvidedInputs() {
        assertEquals(1, minAvgTwoSlice.solution(new int[]{4,2,2,5,1,5,8}));
    }

    @Test
    public void pair() {
        assertEquals(0, minAvgTwoSlice.solution(new int[]{4,4}));
    }

    @Test
    public void simple() {
        assertEquals(4, minAvgTwoSlice.solution(new int[]{1,2,2,5,1,1,1}));
    }

}