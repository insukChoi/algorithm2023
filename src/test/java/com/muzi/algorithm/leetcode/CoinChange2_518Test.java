package com.muzi.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CoinChange2_518Test {
    @Test
    void test1() {
        int amount = 5;
        int[] coins = {1,2,5};
        assertThat(executeSolution(amount, coins)).isEqualTo(4);
    }

    @Test
    void test2() {
        int amount = 3;
        int[] coins = {2};
        assertThat(executeSolution(amount, coins)).isEqualTo(0);
    }

    @Test
    void test3() {
        int amount = 10;
        int[] coins = {10};
        assertThat(executeSolution(amount, coins)).isEqualTo(1);
    }

    private static int executeSolution(final int amount, final int[] coins) {
        return new CoinChange2_518().change(amount, coins);
    }
}