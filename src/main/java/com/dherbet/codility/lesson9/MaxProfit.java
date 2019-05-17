package com.dherbet.codility.lesson9;

import java.util.Arrays;

/**
 * CODILITY ANALYSIS: https://app.codility.com/demo/results/training6B6EKQ-M54/
 * Category: PAINLESS
 * Level: EASY
 * Correctness:	100%
 * Performance:	100%
 * Task score:	100%
 */
public class MaxProfit {

	public int solution(int[] A) {
		System.out.println("A: " + Arrays.toString(A));
		int maximumProfit = 0;
		int minimumValue = A.length > 0 ? A[0] : 0;
		for (int dailyPrice : A) {
			if (dailyPrice < minimumValue) {
				minimumValue = dailyPrice;
			}
			maximumProfit = Math.max(maximumProfit, dailyPrice - minimumValue);
		}
		System.out.println("Maximum profit: " + maximumProfit);
		return maximumProfit;
	}

}