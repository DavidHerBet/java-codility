package com.dherbet.codility.lesson10;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinPerimeterRectangleTest {

    private static MinPerimeterRectangle minPerimeterRectangle;

    @BeforeClass
    public static void setUp() {
        minPerimeterRectangle = new MinPerimeterRectangle();
    }

    @Test
    public void problemProvidedInputs() {
        assertEquals(22, minPerimeterRectangle.solution(30));
    }

}