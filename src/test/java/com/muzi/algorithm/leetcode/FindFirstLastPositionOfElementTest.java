package com.muzi.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindFirstLastPositionOfElementTest {
    @Test
    void test1() {
        int[] input = {5, 7, 7, 8, 8, 10};
        int target = 8;
        assertThat(executeSolution(input, target)).isEqualTo(new int[]{3, 4});
    }

    @Test
    void test2() {
        int[] input = {5, 7, 7, 8, 8, 10};
        int target = 6;
        assertThat(executeSolution(input, target)).isEqualTo(new int[]{-1, -1});
    }

    @Test
    void test3() {
        int[] input = {};
        int target = 0;
        assertThat(executeSolution(input, target)).isEqualTo(new int[]{-1, -1});
    }

    @Test
    void test4() {
        int[] input = {1};
        int target = 1;
        assertThat(executeSolution(input, target)).isEqualTo(new int[]{0, 0});
    }

    @Test
    void test5() {
        int[] input = {2,2};
        int target = 2;
        assertThat(executeSolution(input, target)).isEqualTo(new int[]{0, 1});
    }

    @Test
    void test6() {
        int[] input = {1};
        int target = 0;
        assertThat(executeSolution(input, target)).isEqualTo(new int[]{-1, -1});
    }

    @Test
    void test7() {
        int[] input = {1,4};
        int target = 4;
        assertThat(executeSolution(input, target)).isEqualTo(new int[]{1, 1});
    }

    private int[] executeSolution(int[] input, int target) {
        return new FindFirstLastPositionOfElement_34().searchRange(input, target);
    }
}