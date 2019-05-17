package com.dherbet.codility.lesson9;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxProfitTest {

    private static MaxProfit maxProfit;

    @BeforeClass
    public static void setUp() {
        maxProfit = new MaxProfit();
    }

    @Test
    public void problemProvidedInputs() {
        assertEquals(356, maxProfit.solution(new int[]{23171,21011,21123,21366,21013,21367}));
    }

}