package com.dherbet.codility.lesson7;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NestingTest {

    private static Nesting nesting;

    @BeforeClass
    public static void setUp() {
        nesting = new Nesting();
    }

    @Test
    public void problemProvidedInputs() {
        assertEquals(1, nesting.solution("(()(())())"));
        assertEquals(0, nesting.solution("())"));
    }

    @Test
    public void simple() {
        assertEquals(1, nesting.solution("()"));
        assertEquals(0, nesting.solution(")("));
        assertEquals(0, nesting.solution("((("));
        assertEquals(0, nesting.solution(")))"));
    }

}