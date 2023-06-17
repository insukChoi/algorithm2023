package com.muzi.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class Sum3_15Test {
    @Test
    void test1() {
        int[] nums = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> answer = new ArrayList<>();
        answer.add(List.of(-1, -1, 2));
        answer.add(List.of(-1, 0, 1));

        assertThat(getThreeSum(nums))
                .isEqualTo(answer);
    }

    @Test
    void test2() {
        int[] nums = {0, 1, 1};

        List<List<Integer>> answer = new ArrayList<>();
        assertThat(getThreeSum(nums))
                .isEqualTo(answer);
    }

    @Test
    void test3() {
        int[] nums = {0, 0, 0};

        List<List<Integer>> answer = new ArrayList<>();
        answer.add(List.of(0, 0, 0));

        assertThat(getThreeSum(nums))
                .isEqualTo(answer);
    }


    private static List<List<Integer>> getThreeSum(final int[] nums) {
        return new Sum3_15().threeSum(nums);
    }
}