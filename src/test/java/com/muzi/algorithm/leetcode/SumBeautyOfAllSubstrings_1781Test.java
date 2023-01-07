package com.muzi.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SumBeautyOfAllSubstrings_1781Test {

    @Test
    void test1() {
        String input = "aabcb";
        assertThat(executeSolution(input)).isEqualTo(5);
    }

    @Test
    void test2() {
        String input = "aabcbaa";
        assertThat(executeSolution(input)).isEqualTo(17);
    }

    private int executeSolution(final String input) {
        return new SumBeautyOfAllSubstrings_1781().beautySum(input);
    }
}