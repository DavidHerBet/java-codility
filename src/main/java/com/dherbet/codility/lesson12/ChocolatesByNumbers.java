package com.dherbet.codility.lesson12;

/**
 * CODILITY ANALYSIS: https://app.codility.com/demo/results/trainingQY36WV-8GR/
 * Category: PAINLESS
 * Level: EASY
 * Correctness:	100%
 * Performance:	100%
 * Task score:	100%
 */
public class ChocolatesByNumbers {

	public int solution(int N, int M) {
		System.out.println("N = " + N + ", M = " + M);
		int numberOfChocolatesToBeEaten = N / greatestCommonDivisor(N, M, 1);
		System.out.println("Number of chocolates to be eaten: " + numberOfChocolatesToBeEaten);
		return numberOfChocolatesToBeEaten;
	}

	private int greatestCommonDivisor(int n, int m, int i) {
		if (n == m) {
			return i * n;
		} else if (n % 2 == 0 && m % 2 == 0) {
			return greatestCommonDivisor(n / 2, m / 2, 2 * i);
		} else if (n % 2 == 0) {
			return greatestCommonDivisor(n / 2, m, i);
		} else if (m % 2 == 0) {
			return greatestCommonDivisor(n, m / 2, i);
		} else if (n > m) {
			return greatestCommonDivisor(n - m, m, i);
		} else {
			return greatestCommonDivisor(n, m - n, i);
		}
	}

}