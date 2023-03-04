package com.muzi.algorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CorrectBracketTest {
    @Test
    void test1() {
        String s = "()()";
        assertThat(executeSolution(s)).isTrue();
    }

    @Test
    void test2() {
        String s = "(())()";
        assertThat(executeSolution(s)).isTrue();
    }

    @Test
    void test3() {
        String s = ")()(";
        assertThat(executeSolution(s)).isFalse();
    }

    @Test
    void test4() {
        String s = "(()(";
        assertThat(executeSolution(s)).isFalse();
    }

    @Test
    void test5() {
        String s = "())(()()";
        assertThat(executeSolution(s)).isFalse();
    }

    private boolean executeSolution(String s) {
        return new CorrectBracket().solution(s);
    }
}