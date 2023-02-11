package com.muzi.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SearchInsertPosition_35Test {
    @Test
    void test1() {
        int[] nums = {1,3,5,6};
        int target = 5;
        assertThat(executeSolution(nums, target)).isEqualTo(2);
    }

    @Test
    void test2() {
        int[] nums = {1,3,5,6};
        int target = 2;
        assertThat(executeSolution(nums, target)).isEqualTo(1);
    }

    @Test
    void test3() {
        int[] nums = {1,3,5,6};
        int target = 7;
        assertThat(executeSolution(nums, target)).isEqualTo(4);
    }

    @Test
    void test4() {
        int[] nums = {1,3,5,6};
        int target = 0;
        assertThat(executeSolution(nums, target)).isEqualTo(0);
    }

    @Test
    void test5() {
        int[] nums = {1,3};
        int target = 2;
        assertThat(executeSolution(nums, target)).isEqualTo(1);
    }


    private int executeSolution(int[] nums, int target) {
        return new SearchInsertPosition_35().searchInsert(nums, target);
    }
}