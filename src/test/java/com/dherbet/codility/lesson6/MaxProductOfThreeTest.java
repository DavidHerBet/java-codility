package com.dherbet.codility.lesson6;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxProductOfThreeTest {

    private static MaxProductOfThree maxProductOfThree;

    @BeforeClass
    public static void setUp() {
        maxProductOfThree = new MaxProductOfThree();
    }

    @Test
    public void problemProvidedInputs() {
        assertEquals(60, maxProductOfThree.solution(new int[]{-3,1,2,-2,5,6}));
    }

    @Test
    public void simple() {
        assertEquals(125, maxProductOfThree.solution(new int[]{-5, 5, -5, 4}));
    }

}