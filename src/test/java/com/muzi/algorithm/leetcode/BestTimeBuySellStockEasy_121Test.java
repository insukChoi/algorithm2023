package com.muzi.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BestTimeBuySellStockEasy_121Test {

    @Test
    void test1() {
        int[] prices = {7,1,5,3,6,4};
        assertThat(executeSolution(prices)).isEqualTo(5);
    }

    @Test
    void test2() {
        int[] prices = {7,6,4,3,1};
        assertThat(executeSolution(prices)).isEqualTo(0);
    }

    @Test
    void test3() {
        int[] prices = {1,2};
        assertThat(executeSolution(prices)).isEqualTo(1);
    }

    @Test
    void test4() {
        int[] prices = {2, 4, 1};
        assertThat(executeSolution(prices)).isEqualTo(2);
    }

    @Test
    void test5() {
        int[] prices = {2,1,2,0,1};
        assertThat(executeSolution(prices)).isEqualTo(1);
    }


    @Test
    void test6() {
        int[] prices = {1,4,1,4,3,1};
        assertThat(executeSolution(prices)).isEqualTo(3);
    }

    private int executeSolution(int[] prices) {
        return new BestTimeBuySellStockEasy_121().maxProfit(prices);
    }
}