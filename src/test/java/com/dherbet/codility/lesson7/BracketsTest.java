package com.dherbet.codility.lesson7;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BracketsTest {

    private static Brackets brackets;

    @BeforeClass
    public static void setUp() {
        brackets = new Brackets();
    }

    @Test
    public void problemProvidedInputs() {
        assertEquals(1, brackets.solution("{[()()]}"));
        assertEquals(0, brackets.solution("([)()]"));
    }

    @Test
    public void simple() {
        assertEquals(0, brackets.solution(")("));
        assertEquals(0, brackets.solution("{{{{"));
    }

}