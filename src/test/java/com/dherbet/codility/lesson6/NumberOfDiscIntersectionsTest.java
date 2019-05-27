package com.dherbet.codility.lesson6;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfDiscIntersectionsTest {

    private static NumberOfDiscIntersections numberOfDiscIntersections;

    @BeforeClass
    public static void setUp() {
        numberOfDiscIntersections = new NumberOfDiscIntersections();
    }

    @Test
    public void problemProvidedInputs() {
        assertEquals(11, numberOfDiscIntersections.solution(new int[]{1,5,2,1,4,0}));
    }

    @Test
    public void empty() {
        assertEquals(0, numberOfDiscIntersections.solution(new int[]{}));
    }

    @Test
    public void one() {
        assertEquals(0, numberOfDiscIntersections.solution(new int[]{1}));
    }

    @Test
    public void overflow() {
        assertEquals(3, numberOfDiscIntersections.solution(new int[]{Integer.MAX_VALUE - 2, Integer.MAX_VALUE - 1, Integer.MAX_VALUE}));
    }

    @Test
    public void simple() {
        assertEquals(6, numberOfDiscIntersections.solution(new int[]{1, 0, 1, 0, 1}));
        assertEquals(8, numberOfDiscIntersections.solution(new int[]{1, 0, 1, 0, 3}));
    }

}