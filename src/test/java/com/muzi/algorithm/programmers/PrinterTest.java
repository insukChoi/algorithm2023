package com.muzi.algorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PrinterTest {
    @Test
    void test1() {
        int[] input = {2, 1, 3, 2};
        int location = 2;
        assertThat(executeSolution(input, location)).isEqualTo(1);
    }

    @Test
    void test2() {
        int[] input = {1, 1, 9, 1, 1, 1};
        int location = 0;
        assertThat(executeSolution(input, location)).isEqualTo(5);
    }

    private int executeSolution(int[] priorities, int location) {
        return new Printer().solution(priorities, location);
    }
}