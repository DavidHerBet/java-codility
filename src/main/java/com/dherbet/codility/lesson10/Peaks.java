package com.dherbet.codility.lesson10;

import java.util.Arrays;

/**
 * CODILITY ANALYSIS: https://app.codility.com/demo/results/trainingTUVKHF-ZZH/
 * Category: RESPECTABLE
 * Level: MEDIUM
 * Correctness:	100%
 * Performance:	100%
 * Task score:	100%
 */
public class Peaks {

	public int solution(int[] A) {
		System.out.println("A: " + Arrays.toString(A));
		int maximumNumberOfBlocksContainingPeak = 0;
		if (A.length > 2) {
			boolean nIsPrimal = isPrimal(A.length);
			if (nIsPrimal) {
				if (anyPeak(A)) {
					maximumNumberOfBlocksContainingPeak = 1;
				}
			} else {
				int numberOfPeaks = 0;
				for (int i = 1; i < A.length -1; i++) {
					if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
						numberOfPeaks += 1;
					}
				}
				if (numberOfPeaks > 0) {
					for (int numberOfBlocks = numberOfPeaks; numberOfBlocks >= 1; numberOfBlocks--) {
						if (A.length % numberOfBlocks == 0) {
							if (checkThereIsOnePeakInBlocks(A, numberOfBlocks)) {
								maximumNumberOfBlocksContainingPeak = numberOfBlocks;
								break;
							}
						}
					}
				}
			}
		}
		System.out.println("Maximum number of blocks containing peak: " + maximumNumberOfBlocksContainingPeak);
		return maximumNumberOfBlocksContainingPeak;
	}

	private boolean checkThereIsOnePeakInBlocks(int[] A, int numberOfBlocks) {
		int blockSize = A.length / numberOfBlocks;
		for (int i = 0, start = 0, end = blockSize - 1; i < numberOfBlocks; i++, start = end + 1, end += blockSize) {
			if (!anyPeak(A, start, end)) {
				return false;
			}
		}
		return true;
	}

	private boolean isPrimal(int n) {
		int i = 2;
		while (i * i <= n) {
			if (n % i == 0) {
				return false;
			}
			i += 1;
		}
		return true;
	}

	private boolean anyPeak(int[] A) {
		for (int i = 1; i < A.length -1; i++) {
			if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
				return true;
			}
		}
		return false;
	}

	private boolean anyPeak(int[] A, int start, int end) {
		if (start == 0) {
			for (int i = start + 1; i <= end; i++) {
				if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
					return true;
				}
			}
		} else if (end == A.length - 1) {
			for (int i = start; i < end; i++) {
				if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
					return true;
				}
			}
		} else {
			for (int i = start; i <= end; i++) {
				if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
					return true;
				}
			}
		}
		return false;
	}

}