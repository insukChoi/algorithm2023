package com.muzi.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MinimumDepthOfBinaryTree_111Test {
    @Test
    void test1() {
        MinimumDepthOfBinaryTree_111.TreeNode root = new MinimumDepthOfBinaryTree_111.TreeNode(
                3,
                new MinimumDepthOfBinaryTree_111.TreeNode(9, null, null),
                new MinimumDepthOfBinaryTree_111.TreeNode(20,
                        new MinimumDepthOfBinaryTree_111.TreeNode(15, null, null),
                        new MinimumDepthOfBinaryTree_111.TreeNode(7, null, null)
                )
        );
        assertThat(executeSolution(root)).isEqualTo(2);
    }

    @Test
    void test2() {
        MinimumDepthOfBinaryTree_111.TreeNode root = new MinimumDepthOfBinaryTree_111.TreeNode(
                2,
                null,
                new MinimumDepthOfBinaryTree_111.TreeNode(3,
                        null,
                        new MinimumDepthOfBinaryTree_111.TreeNode(4,
                                null,
                                new MinimumDepthOfBinaryTree_111.TreeNode(5,
                                        null,
                                        new MinimumDepthOfBinaryTree_111.TreeNode(6,
                                                null,
                                                null
                                        )
                                )
                        )
                )
        );
        assertThat(executeSolution(root)).isEqualTo(5);
    }

    private int executeSolution(MinimumDepthOfBinaryTree_111.TreeNode treeNode) {
        return new MinimumDepthOfBinaryTree_111().minDepth(treeNode);
    }
}