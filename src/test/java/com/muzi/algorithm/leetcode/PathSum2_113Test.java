package com.muzi.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PathSum2_113Test {
    @Test
    void test1() {
        PathSum2_113.TreeNode p = new PathSum2_113.TreeNode(
                5,
                new PathSum2_113.TreeNode(4,
                        new PathSum2_113.TreeNode(11,
                                new PathSum2_113.TreeNode(7,
                                        null,
                                        null
                                ),
                                new PathSum2_113.TreeNode(2,
                                        null,
                                        null
                                )
                        ),
                        null
                ),
                new PathSum2_113.TreeNode(8,
                        new PathSum2_113.TreeNode(13,
                                null,
                                null
                        ),
                        new PathSum2_113.TreeNode(4,
                                new PathSum2_113.TreeNode(5,
                                        null,
                                        null
                                ),
                                new PathSum2_113.TreeNode(1,
                                        null,
                                        null
                                )
                        )
                )
        );
        int targetSum = 22;

        final List<List<Integer>> answerList = new ArrayList<>();
        answerList.add(List.of(5,4,11,2));
        answerList.add(List.of(5,8,4,5));

        assertThat(executeSolution(p, targetSum)).isEqualTo(answerList);
    }


    private List<List<Integer>> executeSolution(PathSum2_113.TreeNode p, int targetSum) {
        return new PathSum2_113().pathSum(p, targetSum);
    }
}