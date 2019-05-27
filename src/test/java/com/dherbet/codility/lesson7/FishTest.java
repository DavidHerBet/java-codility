package com.dherbet.codility.lesson7;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FishTest {

    private static Fish fish;

    @BeforeClass
    public static void setUp() {
        fish = new Fish();
    }

    @Test
    public void problemProvidedInputs() {
        assertEquals(2, fish.solution(new int[]{4,3,2,1,5}, new int[]{0,1,0,0,0}));
    }

    @Test
    public void one() {
        assertEquals(1, fish.solution(new int[]{0}, new int[]{0}));
        assertEquals(1, fish.solution(new int[]{0}, new int[]{1}));
    }

    @Test
    public void simple() {
        assertEquals(2, fish.solution(new int[]{0,1}, new int[]{0,1}));
        assertEquals(3, fish.solution(new int[]{1,2,3}, new int[]{0,0,1}));
        assertEquals(1, fish.solution(new int[]{1,2,3}, new int[]{1,1,0}));
    }

    @Test
    public void allVersusLast() {
        int n = 50000;
        int[] sizes = new int[n];
        int[] directions = new int[n];
        for (int i = 0; i < n; i++) {
            sizes[i] = i;
            directions[i] = 1;
        }
        directions[n - 1] = 0;
        assertEquals(1, fish.solution(sizes, directions));
    }

    @Test
    public void extremeRange() {
        int n = 50000;
        int[] sizes = new int[n];
        int[] directions = new int[n];
        for (int i = 0; i < n; i++) {
            sizes[i] = i;
            directions[i] = 0;
        }
        directions[n - 1] = 1;
        assertEquals(n, fish.solution(sizes, directions));
    }

}