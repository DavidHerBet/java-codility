package com.dherbet.codility.lesson3;

import java.util.Arrays;

/**
 * CODILITY ANALYSIS: https://app.codility.com/demo/results/trainingCFEUHV-WQ2/
 * Category: PAINLESS
 * Level: EASY
 * Correctness:	100%
 * Performance:	100%
 * Task score:	100%
 */
public class PermMissingElem {

	public int solution(int[] A) {
		System.out.println("Array A = " + Arrays.toString(A));
		int n = A.length;
		int missingElement = 0;
		boolean[] missingElements = new boolean[n + 2];

		for (int i = 0; i < n; i++) {
			missingElements[A[i]] = true;
		}

		for (int i = 1; i < n + 2; i++) {
			if (!missingElements[i]) {
				missingElement = i;
			}
		}

		System.out.println("Missing element: " + missingElement);
		return missingElement;
	}

}