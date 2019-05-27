package com.dherbet.codility.lesson7;

import java.util.Arrays;
import java.util.Stack;

/**
 * CODILITY ANALYSIS: https://app.codility.com/demo/results/trainingRQWT8G-S64/
 * Category: PAINLESS
 * Level: EASY
 * Correctness:	100%
 * Performance:	100%
 * Task score:	100%
 */
public class Fish {

    public int solution(int[] A, int[] B) {
        System.out.println("A: " + Arrays.toString(A) + ", B: " + Arrays.toString(B));
        Stack<Integer> fishesGoingDownstream = new Stack<>();
        int fishesGoingUpstream = 0;
        for (int i = 0; i < A.length; i++) {
            if (B[i] == 1) {
                fishesGoingDownstream.add(A[i]);
            } else {
                if (fishesGoingDownstream.isEmpty()) {
                    fishesGoingUpstream++;
                } else {
                    int fishesNumber = fishesGoingDownstream.size();
                    for (int j = 0; j < fishesNumber; j++) {
                        if (fishesGoingDownstream.peek() > A[i]) {
                            break;
                        } else {
                            fishesGoingDownstream.pop();
                        }
                    }
                    if (fishesGoingDownstream.isEmpty()) {
                        fishesGoingUpstream++;
                    }
                }
            }
        }
        System.out.println("Fishes that stay alive: " + (fishesGoingUpstream + fishesGoingDownstream.size()));
        return fishesGoingUpstream + fishesGoingDownstream.size();
    }

}
