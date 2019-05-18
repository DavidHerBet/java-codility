package com.dherbet.codility.lesson4;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MaxCountersTest {

    private static MaxCounters maxCounters;

    @BeforeClass
    public static void setUp() {
        maxCounters = new MaxCounters();
    }

    @Test
    public void problemProvidedInputs() {
        assertArrayEquals(new int[]{3,2,2,4,2}, maxCounters.solution(5, new int[]{3,4,4,6,1,4,4}));
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{4,4,4,4,4}, maxCounters.solution(5, new int[]{3,4,4,6,1,4,4,6}));
    }

}