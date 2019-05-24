package com.dherbet.codility.lesson6;

import java.util.Arrays;

/**
 * CODILITY ANALYSIS: https://app.codility.com/demo/results/trainingJ3T6HB-WJ8/
 * Category: PAINLESS
 * Level: EASY
 * Correctness:	100%
 * Performance:	100%
 * Task score:	100%
 */
public class MaxProductOfThree {

    public int solution(int[] A) {
        System.out.println("A: " + Arrays.toString(A));
        Arrays.sort(A);
        int N = A.length;
        int firstTwoElementsPlusLastElementTripletProduct = A[0] * A[1] * A[N - 1];
        int lastElementsTripletProduct = A[N - 1] * A[N - 2] * A[N - 3];
        if (lastElementsTripletProduct > firstTwoElementsPlusLastElementTripletProduct) {
            return lastElementsTripletProduct;
        } else {
            return firstTwoElementsPlusLastElementTripletProduct;
        }
    }

}
