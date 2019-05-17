package com.dherbet.codility.lesson8;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DominatorTest {

    private static Dominator dominator;

    @BeforeClass
    public static void setUp() {
        dominator = new Dominator();
    }

    @Test
    public void problemProvidedInputs() {
        assertThat(dominator.solution(new int[]{3,4,3,2,3,-1,3,3}), anyOf(is(0), is(2), is(4), is(6), is(7)));
    }

}