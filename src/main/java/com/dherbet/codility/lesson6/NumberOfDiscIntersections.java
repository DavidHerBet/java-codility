package com.dherbet.codility.lesson6;

import java.util.Arrays;

/**
 * CODILITY ANALYSIS: https://app.codility.com/demo/results/trainingJ5WH5T-XQV/
 * Category: RESPECTABLE
 * Level: MEDIUM
 * Correctness:	100%
 * Performance:	12%
 * Task score:	56%
 */
public class NumberOfDiscIntersections {

    public int solution(int[] A) {
        System.out.println("A: " + Arrays.toString(A));
        int numberOfPairs = 0;
        double maxValue = Integer.MAX_VALUE;
        for (int J = 0; J < A.length; J++) {
            int jRadius = A[J];
            for (int K = J + 1; K < A.length; K++) {
                int distance = K - J;
                int kRadius = A[K];
                if (distance / maxValue <= jRadius / maxValue + kRadius / maxValue) {
                    numberOfPairs += 1;
                }
                if (numberOfPairs > 10000000) {
                    numberOfPairs = -1;
                    break;
                }
            }
        }
        System.out.println("Number of pairs: " + numberOfPairs);
        return numberOfPairs;
    }

}
