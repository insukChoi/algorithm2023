package com.muzi.algorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MakeBiggestNumberTest {
    private static final MakeBiggestNumber solution = new MakeBiggestNumber();

    @Test
    void test1() {
        String number = "1924";
        int k = 2;
        assertThat(executeSolution(number, k)).isEqualTo("94");
    }

    @Test
    void test2() {
        String number = "1924";
        int k = 2;
        assertThat(executeSolution(number, k)).isEqualTo("94");
    }

    @Test
    void test3() {
        String number = "1924";
        int k = 2;
        assertThat(executeSolution(number, k)).isEqualTo("94");
    }

    private String executeSolution(String number, int k) {
        return solution.solution(number, k);
    }

}