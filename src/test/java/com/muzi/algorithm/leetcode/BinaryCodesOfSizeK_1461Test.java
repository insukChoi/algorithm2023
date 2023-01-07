package com.muzi.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryCodesOfSizeK_1461Test {
    @Test
    void test1() {
        String s = "00110110";
        int k = 2;
        assertThat(executeSolution(s, k)).isTrue();
    }

    @Test
    void test2() {
        String s = "0110";
        int k = 1;
        assertThat(executeSolution(s, k)).isTrue();
    }

    @Test
    void test3() {
        String s = "0110";
        int k = 2;
        assertThat(executeSolution(s, k)).isFalse();
    }

    private boolean executeSolution(String s, int k) {
        return new BinaryCodesOfSizeK_1461().hasAllCodes(s, k);
    }
}