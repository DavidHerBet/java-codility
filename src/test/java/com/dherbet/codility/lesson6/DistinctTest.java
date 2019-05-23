package com.dherbet.codility.lesson6;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class DistinctTest {

    private static Distinct distinct;

    @BeforeClass
    public static void setUp() {
        distinct = new Distinct();
    }

    @Test
    public void problemProvidedInputs() {
        assertEquals(3, distinct.solution(new int[]{2,1,1,2,3,1}));
    }

}