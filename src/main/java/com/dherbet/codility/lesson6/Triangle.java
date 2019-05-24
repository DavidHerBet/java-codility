package com.dherbet.codility.lesson6;

import java.util.Arrays;

/**
 * CODILITY ANALYSIS: https://app.codility.com/demo/results/trainingKA3EES-8GJ/
 * Category: PAINLESS
 * Level: EASY
 * Correctness:	100%
 * Performance:	100%
 * Task score:	100%
 */
public class Triangle {

    public int solution(int[] A) {
        System.out.println("A: " + Arrays.toString(A));
        boolean triangleTripletExists = false;
        if (A.length > 2) {
            Arrays.sort(A);
            for (int R = A.length - 1; R > 1 ; R--) {
                int Q = R - 1;
                int P = Q - 1;
                if (greaterThan(A[P], A[Q], A[R]) && greaterThan(A[Q], A[R], A[P]) && greaterThan(A[R], A[P], A[Q])) {
                    triangleTripletExists = true;
                    break;
                }
            }
            System.out.println("Triangle triplet: " + triangleTripletExists);
        }
        return triangleTripletExists ? 1 : 0;
    }

    private boolean greaterThan(int a, int b, int c) {
        double maxAllowedValue = Integer.MAX_VALUE;
        if (a / maxAllowedValue + b / maxAllowedValue > c / maxAllowedValue) {
            return true;
        }
        return false;
    }

}
