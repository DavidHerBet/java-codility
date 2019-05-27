package com.dherbet.codility.lesson7;

import java.util.Stack;

/**
 * CODILITY ANALYSIS: https://app.codility.com/demo/results/trainingW4W3MZ-WPF/
 * Category: PAINLESS
 * Level: EASY
 * Correctness:	100%
 * Performance:	100%
 * Task score:	100%
 */
public class Brackets {

    public int solution(String S) {
        System.out.println("S: " + S);
        boolean isProperlyNested = true;
        Stack<Character> characterStack = new Stack<>();
        for (Character character : S.toCharArray()) {
            if (isLeftCharacter(character)) {
                characterStack.push(character);
            } else {
                if (!characterStack.isEmpty()) {
                    Character lastCharacter = characterStack.peek();
                    if (properlyNested(lastCharacter, character)) {
                        characterStack.pop();
                    } else {
                        isProperlyNested = false;
                        break;
                    }
                } else {
                    isProperlyNested = false;
                    break;
                }
            }
        }
        if (!characterStack.isEmpty()) {
            isProperlyNested = false;
        }
        System.out.println("Is S properly nested?: " + isProperlyNested);
        return isProperlyNested ? 1 : 0;
    }

    private boolean isLeftCharacter(Character character) {
        return character == '(' || character == '{' || character == '[';
    }

    private boolean properlyNested(Character lastCharacter, Character character) {
        if (lastCharacter == '(') {
            return character == ')';
        }
        if (lastCharacter == '{') {
            return character == '}';
        }
        return character == ']';
    }

}
