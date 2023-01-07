package com.muzi.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class Permutations_46Test {
    @Test
    void test1() {
        int[] input = {0,1};
        List<Integer> list1 = new ArrayList<>() {{
            add(0);
            add(1);
        }};
        List<Integer> list2 = new ArrayList<>() {{
            add(1);
            add(0);
        }};
        List<List<Integer>> permutationsList = new ArrayList<>() {{
            add(list1);
            add(list2);
        }};
        assertThat(executeSolution(input)).isEqualTo(
                permutationsList
        );
    }

    private List<List<Integer>> executeSolution(int[] input) {
        return new Permutations_46().permute(input);
    }
}