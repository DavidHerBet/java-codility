package com.dherbet.codility.lesson12;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChocolatesByNumbersTest {

    private static ChocolatesByNumbers chocolatesByNumbers;

    @BeforeClass
    public static void setUp() {
        chocolatesByNumbers = new ChocolatesByNumbers();
    }

    @Test
    public void problemProvidedInputs() {
        assertEquals(5, chocolatesByNumbers.solution(10, 4));
    }

}