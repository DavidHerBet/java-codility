package com.dherbet.codility.lesson6;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

    private static Triangle triangle;

    @BeforeClass
    public static void setUp() {
        triangle = new Triangle();
    }

    @Test
    public void problemProvidedInputs() {
        assertEquals(1, triangle.solution(new int[]{10,2,5,1,8,20}));
        assertEquals(0, triangle.solution(new int[]{10,50,5,1}));
    }

    @Test
    public void empty() {
        assertEquals(0, triangle.solution(new int[]{}));
    }

    @Test
    public void one() {
        assertEquals(0, triangle.solution(new int[]{0}));
        assertEquals(0, triangle.solution(new int[]{-10000000}));
        assertEquals(0, triangle.solution(new int[]{10000000}));
    }

    @Test
    public void two() {
        assertEquals(0, triangle.solution(new int[]{0,0}));
        assertEquals(0, triangle.solution(new int[]{0,1}));
        assertEquals(0, triangle.solution(new int[]{-10,5}));
    }

    @Test
    public void three() {
        assertEquals(0, triangle.solution(new int[]{0,0,0}));
        assertEquals(0, triangle.solution(new int[]{0,1,2}));
        assertEquals(0, triangle.solution(new int[]{-10,5,1000}));
    }

    @Test
    public void simple() {
        assertEquals(1, triangle.solution(new int[]{2,3,4,7}));
        assertEquals(1, triangle.solution(new int[]{7,4,3,2}));
    }

    @Test
    public void extremeArithOverflow() {
        assertEquals(1, triangle.solution(new int[]{Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE}));
    }

}