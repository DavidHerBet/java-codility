package com.dherbet.codility.lesson5;

/**
 * CODILITY ANALYSIS: https://app.codility.com/demo/results/training5988QS-WJ8/
 * Category: RESPECTABLE
 * Level: MEDIUM
 * Correctness:	100%
 * Performance:	100%
 * Task score:	100%
 */
public class CountDiv {

	public int solution(int A, int B, int K) {
		return A % K == 0 ? B / K - A / K + 1: B / K - A / K;
	}

}