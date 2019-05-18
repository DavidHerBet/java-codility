package com.dherbet.codility.lesson4;

import java.util.Arrays;

/**
 * CODILITY ANALYSIS: https://app.codility.com/demo/results/trainingR57P83-SSS/
 * Category: RESPECTABLE
 * Level: MEDIUM
 * Correctness:	100%
 * Performance:	100%
 * Task score:	100%
 */
public class MaxCounters {

	public int[] solution(int N, int[] A) {
		System.out.println("N = " + N + ", A = " + Arrays.toString(A));
		int[] counters = new int[N];
		int maxValue = 0;
		int maxCounter = 0;
		for (int i = 0; i < A.length; i++) {
			int element = A[i];
			if (element > N) {
				maxCounter = maxValue;
			} else {
				counters[element - 1] = 1 + Math.max(maxCounter, counters[element - 1]);
				if (counters[element - 1] > maxValue) {
					maxValue = counters[element - 1];
				}
			}
		}
		for (int i = 0; i < N; i++) {
			if (counters[i] < maxCounter) {
				counters[i] = maxCounter;
			}
		}
		System.out.println("Counters are: " + Arrays.toString(counters));
		return counters;
	}

}