package com.dherbet.codility.lesson2;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OddOccurrencesInArrayTest {

    private static OddOccurrencesInArray oddOccurrencesInArray;

    @BeforeClass
    public static void setUp() {
        oddOccurrencesInArray = new OddOccurrencesInArray();
    }

    @Test
    public void problemProvidedInputs() {
        assertEquals(7, oddOccurrencesInArray.solution(new int[]{9,3,9,3,9,7,9}));
    }

    @Test
    public void extremeSimple() {
        assertEquals(42, oddOccurrencesInArray.solution(new int[]{42}));
    }

}