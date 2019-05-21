package com.dherbet.codility.lesson5;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountDivTest {

    private static CountDiv countDiv;

    @BeforeClass
    public static void setUp() {
        countDiv = new CountDiv();
    }

    @Test
    public void problemProvidedInputs() {
        assertEquals(3, countDiv.solution(6, 11, 2));
    }

    @Test
    public void simple() {
        assertEquals(1, countDiv.solution(0, 0, 11));
        assertEquals(8, countDiv.solution(0, 14, 2));
        assertEquals(20, countDiv.solution(11, 345, 17));
    }

}