package com.muzi.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindUniqueBinaryString_1980Test {
    @Test
    void test1() {
        String[] input = {"01","10"};
        assertThat(executeSolution(input)).isEqualTo("00");
    }

    @Test
    void test2() {
        String[] input = {"00","01"};
        assertThat(executeSolution(input)).isEqualTo("10");
    }

    @Test
    void test3() {
        String[] input = {"111","011","001"};
        assertThat(executeSolution(input)).isEqualTo("000");
    }

    private String executeSolution(String[] input) {
        return new FindUniqueBinaryString_1980().findDifferentBinaryString(input);
    }
}