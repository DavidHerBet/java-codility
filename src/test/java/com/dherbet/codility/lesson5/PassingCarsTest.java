package com.dherbet.codility.lesson5;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassingCarsTest {

    private static PassingCars passingCars;

    @BeforeClass
    public static void setUp() {
        passingCars = new PassingCars();
    }

    @Test
    public void problemProvidedInputs() {
        assertEquals(5, passingCars.solution(new int[]{0,1,0,1,1}));
    }

}