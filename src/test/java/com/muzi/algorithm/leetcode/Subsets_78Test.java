package com.muzi.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class Subsets_78Test {

    @Test
    void test1() {
        int[] input = {1,2,3};
        List<List<Integer>> expected = List.of(
                List.of(),
                List.of(1),
                List.of(2),
                List.of(3),
                List.of(1, 2),
                List.of(1, 3),
                List.of(2, 3),
                List.of(1, 2, 3)
        );
        assertThat(executeSolution(input)).containsExactlyInAnyOrderElementsOf(expected);
    }

    private List<List<Integer>> executeSolution(int[] input) {
        return new Subsets_78().subsets(input);
    }
}