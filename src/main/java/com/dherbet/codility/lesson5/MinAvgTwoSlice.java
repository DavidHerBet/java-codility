package com.dherbet.codility.lesson5;

import java.util.Arrays;

/**
 * CODILITY ANALYSIS: https://app.codility.com/demo/results/trainingCXHJDZ-D5D/
 * Category: RESPECTABLE
 * Level: MEDIUM
 * Correctness:	100%
 * Performance:	100%
 * Task score:	100%
 */
public class MinAvgTwoSlice {

	public int solution(int[] A) {
		System.out.println("A: " + Arrays.toString(A));
		double[] prefix = new double[A.length];
		double minValue = Integer.MAX_VALUE;
		int startingPosition = 0;
		for (int i = 0; i < A.length - 1; i++) {
			double pairAverage = (double) (A[i] + A[i + 1]) / 2;
			prefix[i] = pairAverage;
			if (pairAverage < minValue) {
				startingPosition = i;
				minValue = pairAverage;
			}
		}
		int minimumSlice = 3;
		boolean availableSolution = true;
		while (availableSolution) {
			boolean betterSolution = false;
			for (int i = 0; i < A.length - minimumSlice + 1; i++) {
				double average = getAverage(i, minimumSlice, A);
				if (average < minValue || (average == minValue && i < startingPosition)) {
					startingPosition = i;
					minValue = average;
					betterSolution = true;
				}
			}
			if (!betterSolution) {
				availableSolution = false;
			}

			minimumSlice++;
		}

		System.out.println("Starting position is: " + startingPosition);
		return startingPosition;
	}

	private double getAverage(int start, int minimumSlice, int[] A) {
		double average = 0;
		for (int i = start; i < start + minimumSlice; i++) {
			average += A[i];
		}
		return average / minimumSlice;
	}

}