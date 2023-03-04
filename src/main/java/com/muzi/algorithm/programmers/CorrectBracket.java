package com.muzi.algorithm.programmers;

import java.util.Stack;

/**
 * 스택/큐 > 올바른 괄호
 *
 * @see [올바른 괄호](https://school.programmers.co.kr/learn/courses/30/lessons/12909)
 */
public class CorrectBracket {
    boolean solution(String s) {
        final Stack<Character> stack = new Stack<>();

        for (final char c : s.toCharArray()) {
            if (c == '(') stack.push(c);
            else {
                if (stack.size() == 0) return false;
                stack.pop();
            }
        }

        return stack.size() == 0;
    }
}
