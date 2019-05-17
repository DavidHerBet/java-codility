package com.dherbet.codility.lesson4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * CODILITY ANALYSIS: https://app.codility.com/demo/results/trainingNX9JWB-P43/
 * Category: PAINLESS
 * Level: EASY
 * Correctness:	100%
 * Performance:	100%
 * Task score:	100%
 */
public class FrogRiverOne {

	public int solution(int X, int[] A) {
		System.out.println("X:" + X + ", A: " + Arrays.toString(A));
		int earliestTimeToCrossTheRiver = -1;
		Set<Integer> positionLeaves = new HashSet<>();
		for (int i = 1; i <= X; i++) {
			positionLeaves.add(i);
		}
		for (int i = 0; i < A.length; i++) {
			int position = A[i];
			positionLeaves.remove(position);
			if (positionLeaves.isEmpty()) {
				earliestTimeToCrossTheRiver = i;
				break;
			}
		}
		System.out.println("Earliest time to cross the river: " + earliestTimeToCrossTheRiver);
		return earliestTimeToCrossTheRiver;
	}

}