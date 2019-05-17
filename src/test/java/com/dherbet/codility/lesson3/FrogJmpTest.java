package com.dherbet.codility.lesson3;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrogJmpTest {

    private static FrogJmp frogJmp;

    @BeforeClass
    public static void setUp() {
        frogJmp = new FrogJmp();
    }

    @Test
    public void problemProvidedInputs() {
        assertEquals(3, frogJmp.solution(10, 85, 30));
    }

}