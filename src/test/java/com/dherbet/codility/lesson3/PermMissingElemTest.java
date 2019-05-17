package com.dherbet.codility.lesson3;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PermMissingElemTest {

    private static PermMissingElem permMissingElem;

    @BeforeClass
    public static void setUp() {
        permMissingElem = new PermMissingElem();
    }

    @Test
    public void problemProvidedInputs() {
        assertEquals(4, permMissingElem.solution(new int[]{2,3,1,5}));
    }

    @Test
    public void missingElementIsNPlusOne() {
        assertEquals(5, permMissingElem.solution(new int[]{1,2,3,4}));
    }

}