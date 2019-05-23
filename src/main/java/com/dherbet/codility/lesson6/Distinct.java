package com.dherbet.codility.lesson6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * CODILITY ANALYSIS: https://app.codility.com/demo/results/training8UDZ6K-2GB/
 * Category: PAINLESS
 * Level: EASY
 * Correctness:	100%
 * Performance:	100%
 * Task score:	100%
 */
public class Distinct {

    public int solution(int[] A) {
        System.out.println("A: " + Arrays.toString(A));
        Set<Integer> distinctValues = new HashSet<>();
        for (int value: A) {
            distinctValues.add(value);
        }
        System.out.println("Number of distinct values: " + distinctValues.size());
        return distinctValues.size();
    }

}
