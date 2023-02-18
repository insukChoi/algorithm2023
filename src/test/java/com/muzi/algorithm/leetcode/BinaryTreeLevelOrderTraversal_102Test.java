package com.muzi.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

class BinaryTreeLevelOrderTraversal_102Test {
    @Test
    void test1() {
        BinaryTreeLevelOrderTraversal_102.TreeNode root = new BinaryTreeLevelOrderTraversal_102.TreeNode(
                3,
                new BinaryTreeLevelOrderTraversal_102.TreeNode(9,
                        null,
                        null
                ),
                new BinaryTreeLevelOrderTraversal_102.TreeNode(20,
                        new BinaryTreeLevelOrderTraversal_102.TreeNode(15, null, null),
                        new BinaryTreeLevelOrderTraversal_102.TreeNode(7, null, null)
                )
        );

        assertThat(executeSolution(root)).isEqualTo(asList(asList(3), asList(9, 20), asList(15, 7)));
    }

    private List<List<Integer>> executeSolution(BinaryTreeLevelOrderTraversal_102.TreeNode treeNode) {
        return new BinaryTreeLevelOrderTraversal_102().levelOrder(treeNode);
    }
}