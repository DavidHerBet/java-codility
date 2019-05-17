package com.dherbet.codility.lesson8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * CODILITY ANALYSIS: https://app.codility.com/demo/results/training7MN45K-3XZ/
 * Category: PAINLESS
 * Level: EASY
 * Correctness:	100%
 * Performance:	100%
 * Task score:	100%
 */
public class Dominator {

	public int solution(int[] A) {
		System.out.println("A: " + Arrays.toString(A));
		int dominator = -1;
		List<Integer> stack = new ArrayList<>();
		for (int element : A) {
			if (stack.isEmpty()) {
				stack.add(element);
			} else {
				if (element != stack.get(stack.size() - 1)) {
					stack.remove(stack.size() - 1);
				} else {
					stack.add(element);
				}
			}
		}
		if (!stack.isEmpty()) {
			int candidate = stack.get(0);
			int count = 0;
			int index = 0;
			for (int i = 0; i < A.length; i++) {
				if (A[i] == candidate) {
					count += 1;
					index = i;
				}
			}
			if (count > (A.length/2)) {
				dominator = index;
			}
		}
		System.out.println("Dominator: " + dominator);
		return dominator;
	}

}