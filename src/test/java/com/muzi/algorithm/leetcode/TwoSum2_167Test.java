package com.muzi.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TwoSum2_167Test {
    @Test
    void test1() {
        int[] numbers = {2,7,11,15};
        int target = 9;
        assertThat(executeSolution(numbers, target)).isEqualTo(new int[]{1, 2});
    }

    @Test
    void test2() {
        int[] numbers = {2,3,4};
        int target = 6;
        assertThat(executeSolution(numbers, target)).isEqualTo(new int[]{1, 3});
    }

    @Test
    void test3() {
        int[] numbers = {-1,0};
        int target = -1;
        assertThat(executeSolution(numbers, target)).isEqualTo(new int[]{1, 2});
    }

    private int[] executeSolution(int[] numbers, int target) {
        return new TwoSum2_167().twoSum(numbers, target);
    }
}