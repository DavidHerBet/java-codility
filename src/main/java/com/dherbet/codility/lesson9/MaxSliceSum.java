package com.dherbet.codility.lesson9;

import java.util.Arrays;

/**
 * CODILITY ANALYSIS: https://app.codility.com/demo/results/trainingBSTWWT-WHU/
 * Category: PAINLESS
 * Level: EASY
 * Correctness:	100%
 * Performance:	100%
 * Task score:	100%
 */
public class MaxSliceSum {

	public int solution(int[] A) {
		System.out.println("A: " + Arrays.toString(A));
		int maximumEnding = 0;
		int maximumSlice = A[0];
		for (int value : A) {
			maximumEnding = Math.max(value, maximumEnding + value);
			maximumSlice = Math.max(maximumSlice, maximumEnding);
		}
		System.out.println("Maximum slice: " + maximumSlice);
		return maximumSlice;
	}

}