package com.dherbet.codility.lesson4;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PermCheckTest {

    private static PermCheck permCheck;

    @BeforeClass
    public static void setUp() {
        permCheck = new PermCheck();
    }

    @Test
    public void problemProvidedInputs() {
        assertEquals(1, permCheck.solution(new int[]{4,1,3,2}));
        assertEquals(0, permCheck.solution(new int[]{4,1,3}));
    }

}