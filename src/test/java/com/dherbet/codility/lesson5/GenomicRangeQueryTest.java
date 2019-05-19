package com.dherbet.codility.lesson5;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class GenomicRangeQueryTest {

    private static GenomicRangeQuery genomicRangeQuery;

    @BeforeClass
    public static void setUp() {
        genomicRangeQuery = new GenomicRangeQuery();
    }

    @Test
    public void problemProvidedInputs() {
        assertArrayEquals(new int[]{2,4,1}, genomicRangeQuery.solution("CAGCCTA", new int[]{2,5,0}, new int[]{4,5,6}));
    }

    @Test
    public void extremeDouble() {
        assertArrayEquals(new int[]{2,1,1}, genomicRangeQuery.solution("CA", new int[]{0,1,0}, new int[]{0,1,1}));
        assertArrayEquals(new int[]{4,1,1}, genomicRangeQuery.solution("TA", new int[]{0,1,0}, new int[]{0,1,1}));
        assertArrayEquals(new int[]{4,4,4}, genomicRangeQuery.solution("TT", new int[]{0,1,0}, new int[]{0,1,1}));
    }

}