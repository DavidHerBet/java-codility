package com.dherbet.codility.lesson4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * CODILITY ANALYSIS: https://app.codility.com/demo/results/trainingQKV5G6-8SR/
 * Category: RESPECTABLE
 * Level: MEDIUM
 * Correctness:	100%
 * Performance:	100%
 * Task score:	100%
 */
public class MissingIntegers {

	public int solution(int[] A) {
		System.out.println("A = " + Arrays.toString(A));
		int smallestPositiveInteger = 1;
		int maxValue = 0;
		boolean allValuesAreNegative = true;
		Arrays.sort(A);
		Set<Integer> set = new HashSet<>();
		for (int value : A) {
			if (value > 0) {
				set.add(value);
				allValuesAreNegative = false;
				if (value > maxValue) {
					maxValue = value;
				}
			}
		}
		if (!allValuesAreNegative) {
			boolean smallestPositiveIntegerFinded = false;
			int i = 1;
			while(!smallestPositiveIntegerFinded && i < maxValue) {
				if (!set.contains(i)) {
					smallestPositiveIntegerFinded = true;
					smallestPositiveInteger = i;
				}
				i++;
			}
			if (!smallestPositiveIntegerFinded) {
				smallestPositiveInteger = maxValue + 1;
			}
		}
		System.out.println("Missing integer is: " + smallestPositiveInteger);
		return smallestPositiveInteger;
	}

}