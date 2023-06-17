package com.muzi.algorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ExpressibleTreeTest {

    @Test
    void test1() {
        long[] numbers = {7, 42, 5};
        assertThat(executeSolution(numbers)).isEqualTo(new int[]{1, 1, 0});
    }

    @Test
    void test2() {
        long[] numbers = {63, 111, 95};
        assertThat(executeSolution(numbers)).isEqualTo(new int[]{1, 1, 0});
    }

    @Test
    void test3() {
        long[] numbers = {128};
        assertThat(executeSolution(numbers)).isEqualTo(new int[]{1});
    }

    private int[] executeSolution(long[] numbers) {
        return new ExpressibleTree().solution(numbers);
    }
}