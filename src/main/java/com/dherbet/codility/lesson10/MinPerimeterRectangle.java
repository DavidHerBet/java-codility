package com.dherbet.codility.lesson10;

/**
 * CODILITY ANALYSIS: https://app.codility.com/demo/results/trainingCMHQYT-QCB/
 * Category: PAINLESS
 * Level: EASY
 * Correctness:	100%
 * Performance:	100%
 * Task score:	100%
 */
public class MinPerimeterRectangle {

	public int solution(int N) {
		System.out.println("N = " + N);
		int side = (int) Math.sqrt(N);
		while (N % side != 0) {
			side--;
		}
		int minimumPerimeterRectangle = 2 * (side + (N/side));
		System.out.println("Minimum perimeter rectangle: " + minimumPerimeterRectangle);
		return minimumPerimeterRectangle;
	}

}