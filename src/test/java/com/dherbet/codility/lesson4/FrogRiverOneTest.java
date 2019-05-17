package com.dherbet.codility.lesson4;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrogRiverOneTest {

    private static FrogRiverOne frogRiverOne;

    @BeforeClass
    public static void setUp() {
        frogRiverOne = new FrogRiverOne();
    }

    @Test
    public void problemProvidedInputs() {
        assertEquals(6, frogRiverOne.solution(5, new int[]{1,3,1,4,2,3,5,4}));
    }


}