package com.dherbet.codility.lesson3;

import java.util.Arrays;

/**
 * CODILITY ANALYSIS: https://app.codility.com/demo/results/trainingKPHRU7-NUU/
 * Category: PAINLESS
 * Level: EASY
 * Correctness:	100%
 * Performance:	100%
 * Task score:	100%
 */
public class TapeEquilibrium {

	public int solution(int[] A) {
		System.out.println("Array A = " + Arrays.toString(A));
		int n = A.length;
		int[] prefixSum = new int[n];
		int elementsSum = A[0];
		prefixSum[0] = A[0];
		for (int i = 1; i < n; i++) {
			prefixSum[i] = prefixSum[i - 1] + A[i];
			elementsSum += A[i];
		}

		int minimalDifference = Integer.MAX_VALUE;

		for (int i = 1; i < n; i++) {
			int difference = Math.abs(prefixSum[i - 1] - (elementsSum - prefixSum[i - 1]));
			if (difference < minimalDifference) {
				minimalDifference = difference;
			}
		}

		System.out.println("Minimal difference: " + minimalDifference);
		return minimalDifference;
	}

}