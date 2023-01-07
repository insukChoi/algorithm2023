package com.muzi.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SingleNumber_136Test {

    @Test
    void test1() {
        int[] input = {2,2,1};
        assertThat(executeSolution(input)).isEqualTo(1);
    }

    @Test
    void test2() {
        int[] input = {4,1,2,1,2};
        assertThat(executeSolution(input)).isEqualTo(4);
    }

    @Test
    void test3() {
        int[] input = {1};
        assertThat(executeSolution(input)).isEqualTo(1);
    }

    private int executeSolution(int[] input) {
        return new SingleNumber_136().singleNumber(input);
    }
}