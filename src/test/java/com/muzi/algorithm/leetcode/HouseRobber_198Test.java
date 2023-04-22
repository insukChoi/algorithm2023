package com.muzi.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HouseRobber_198Test {
    @Test
    void test1() {
        int[] input = {1,2,3,1};
        assertThat(executeSolution(input)).isEqualTo(4);
    }

    @Test
    void test2() {
        int[] input = {2,7,9,3,1};
        assertThat(executeSolution(input)).isEqualTo(12);
    }

    @Test
    void test3() {
        int[] input = {1,2};
        assertThat(executeSolution(input)).isEqualTo(2);
    }


    private int executeSolution(int[] input) {
        return new HouseRobber_198().rob(input);
    }
}