package com.dherbet.codility.lesson10;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PeaksTest {

    private static Peaks peaks;

    @BeforeClass
    public static void setUp() {
        peaks = new Peaks();
    }

    @Test
    public void problemProvidedInputs() {
        assertEquals(3, peaks.solution(new int[]{1,2,3,4,3,4,1,2,3,4,6,2}));
    }

}