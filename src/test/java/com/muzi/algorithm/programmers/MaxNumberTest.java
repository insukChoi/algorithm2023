package com.muzi.algorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxNumberTest {

    private final MaxNumber maxNumber = new MaxNumber();

    @Test
    void test1() {
        int[] input = {6, 10, 2};
        assertThat(executeSolution(input)).isEqualTo("6210");
    }

    @Test
    void test2() {
        int[] input = {3, 30, 34, 5, 9};
        assertThat(executeSolution(input)).isEqualTo("9534330");
    }


    private String executeSolution(int[] input) {
        return maxNumber.solution(input);
    }
}