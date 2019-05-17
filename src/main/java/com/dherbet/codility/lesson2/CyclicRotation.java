package com.dherbet.codility.lesson2;

import java.util.Arrays;

/**
 * CODILITY ANALYSIS: https://app.codility.com/demo/results/trainingJQJT35-MD5/
 * Category: PAINLESS
 * Level: EASY
 * Correctness:	100%
 * Performance:	Not assessed
 * Task score:	100%
 */
public class CyclicRotation {

	public int[] solution(int[] A, int K) {
		System.out.println("Array A = " + Arrays.toString(A) + ", K = " + K);
		int[] rotatedArray = A.clone();
		if (A.length > 1) {
			int numberOfRotations = K % A.length;
			if (numberOfRotations > 0) {
				for (int i = 0; i < numberOfRotations; i++) {
					rotatedArray = rotateArray(rotatedArray);
				}
			}
		}
		System.out.println("Rotated array = " + Arrays.toString(rotatedArray));
		return rotatedArray;
	}

	private int[] rotateArray(int[] array) {
		int[] rotatedArray = new int[array.length];
		int lastValue = array[array.length - 1];
		for (int j = 1; j < array.length; j++) {
			rotatedArray[j] = array[j-1];
		}
		rotatedArray[0] = lastValue;
		return rotatedArray;
	}

}