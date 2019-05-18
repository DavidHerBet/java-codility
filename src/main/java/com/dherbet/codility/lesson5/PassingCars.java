package com.dherbet.codility.lesson5;

import java.util.Arrays;

/**
 * CODILITY ANALYSIS: https://app.codility.com/demo/results/trainingJRU2JU-7JV/
 * Category: PAINLESS
 * Level: EASY
 * Correctness:	100%
 * Performance:	100%
 * Task score:	100%
 */
public class PassingCars {

	public int solution(int[] A) {
		System.out.println("A: " + Arrays.toString(A));
		int[] travellingToWestPassingCars = new int[A.length];
		travellingToWestPassingCars[0] = A[0];
		int totalCarsTravelingToWest = A[0];
		for (int i = 1; i < A.length; i++) {
			travellingToWestPassingCars[i] = travellingToWestPassingCars[i - 1] + A[i];
			if (A[i] == 1) {
				totalCarsTravelingToWest += 1;
			}
		}

		int numberOfPairsOfPassingCars = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == 0) {
				numberOfPairsOfPassingCars += totalCarsTravelingToWest - travellingToWestPassingCars[i];
				if (numberOfPairsOfPassingCars > 1000000000) {
					numberOfPairsOfPassingCars = -1;
					break;
				}
			}
		}

		System.out.println("Number of pairs of passing cars: " + numberOfPairsOfPassingCars);
		return numberOfPairsOfPassingCars;
	}

}