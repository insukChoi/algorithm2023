package com.muzi.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BalancedBinaryTree_110Test {
    @Test
    void test1() {
        BalancedBinaryTree_110.TreeNode root = new BalancedBinaryTree_110.TreeNode(
                3,
                new BalancedBinaryTree_110.TreeNode(9, null, null),
                new BalancedBinaryTree_110.TreeNode(20,
                        new BalancedBinaryTree_110.TreeNode(15, null, null),
                        new BalancedBinaryTree_110.TreeNode(7, null, null)
                )
        );
        assertThat(executeSolution(root)).isTrue();
    }

    @Test
    void test2() {
        BalancedBinaryTree_110.TreeNode root = new BalancedBinaryTree_110.TreeNode(
                1,
                new BalancedBinaryTree_110.TreeNode(2,
                        new BalancedBinaryTree_110.TreeNode(3,
                                new BalancedBinaryTree_110.TreeNode(4, null, null),
                                new BalancedBinaryTree_110.TreeNode(4, null, null)
                        ),
                        new BalancedBinaryTree_110.TreeNode(3, null, null)
                ),
                new BalancedBinaryTree_110.TreeNode(2, null, null)
        );
        assertThat(executeSolution(root)).isFalse();
    }

    private boolean executeSolution(BalancedBinaryTree_110.TreeNode treeNode) {
        return new BalancedBinaryTree_110().isBalanced(treeNode);
    }
}