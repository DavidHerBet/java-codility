package com.dherbet.codility.lesson3;

/**
 * CODILITY ANALYSIS: https://app.codility.com/demo/results/training3J5JCD-3Q2/
 * Category: PAINLESS
 * Level: EASY
 * Correctness:	100%
 * Performance:	100%
 * Task score:	100%
 */
public class FrogJmp {

	public int solution(int X, int Y, int D) {
		System.out.println("X = " + X + ", Y = " + Y + ", D = " + D);
		int minimalNumberOfJumps = (int) Math.ceil((double) (Y - X) / D);
		System.out.println("Minimal number of jumps = " + minimalNumberOfJumps);
		return minimalNumberOfJumps;
	}

}