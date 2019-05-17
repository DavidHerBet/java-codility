package com.dherbet.codility.lesson2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * CODILITY ANALYSIS: https://app.codility.com/demo/results/trainingDYWMVE-T8R/
 * Category: PAINLESS
 * Level: EASY
 * Correctness:	100%
 * Performance:	Not assessed
 * Task score:	100%
 */
public class OddOccurrencesInArray {

	public int solution(int[] A) {
		System.out.println("Array A = " + Arrays.toString(A));
		int n = A.length;
		int unpairedElement;

		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			if (set.contains(A[i])) {
				set.remove(A[i]);
			} else {
				set.add(A[i]);
			}
		}
		unpairedElement = set.iterator().next();

		System.out.println("Unpaired element: " + unpairedElement);
		return unpairedElement;
	}

}