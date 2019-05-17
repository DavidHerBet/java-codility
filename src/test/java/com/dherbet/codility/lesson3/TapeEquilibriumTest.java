package com.dherbet.codility.lesson3;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class TapeEquilibriumTest {

    private static TapeEquilibrium tapeEquilibrium;

    @BeforeClass
    public static void setUp() {
        tapeEquilibrium = new TapeEquilibrium();
    }

    @Test
    public void problemProvidedInputs() {
        assertEquals(1, tapeEquilibrium.solution(new int[]{3,1,2,4,3}));
    }

}