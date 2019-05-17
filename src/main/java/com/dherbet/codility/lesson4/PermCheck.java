package com.dherbet.codility.lesson4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * CODILITY ANALYSIS: https://app.codility.com/demo/results/trainingRXMW7X-9QA/
 * Category: PAINLESS
 * Level: EASY
 * Correctness:	100%
 * Performance:	100%
 * Task score:	100%
 */
public class PermCheck {

	public int solution(int[] A) {
		System.out.println("A: " + Arrays.toString(A));
		boolean isPermutation = true;
		Set<Integer> set = new HashSet<>();
		for (int value : A) {
			if (value < 1 || value > A.length || !set.add(value)) {
				isPermutation = false;
			}
		}
		int result = isPermutation ? 1 : 0;
		System.out.println("Array A is permutation?: " + result);
		return result;
	}

}