package com.dherbet.codility.lesson7;

/**
 * CODILITY ANALYSIS: https://app.codility.com/demo/results/trainingCPPDV9-ZR9/
 * Category: PAINLESS
 * Level: EASY
 * Correctness:	100%
 * Performance:	100%
 * Task score:	100%
 */
public class Nesting {

    public int solution(String S) {
        System.out.println("S: " + S);
        int characterStack = 0;
        for (Character character : S.toCharArray()) {
            if (character == '(') {
                characterStack++;
            } else {
                characterStack--;
                if (characterStack < 0) {
                    break;
                }
            }
        }
        System.out.println("Is S properly nested?: " + (characterStack == 0));
        return characterStack == 0 ? 1 : 0;
    }

}
