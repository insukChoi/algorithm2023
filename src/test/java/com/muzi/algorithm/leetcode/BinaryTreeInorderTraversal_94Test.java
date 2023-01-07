package com.muzi.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryTreeInorderTraversal_94Test {
    @Test
    void test1() {
        BinaryTreeInorderTraversal_94.TreeNode root = new BinaryTreeInorderTraversal_94.TreeNode(
                1,
                null,
                new BinaryTreeInorderTraversal_94.TreeNode(2,
                        new BinaryTreeInorderTraversal_94.TreeNode(3, null, null),
                        null
                )
        );
        assertThat(executeSolution(root)).isEqualTo(Arrays.asList(1, 3, 2));
    }

    @Test
    void test2() {
        BinaryTreeInorderTraversal_94.TreeNode root = null;
        assertThat(executeSolution(root)).isEqualTo(List.of());
    }

    @Test
    void test3() {
        BinaryTreeInorderTraversal_94.TreeNode root = new BinaryTreeInorderTraversal_94.TreeNode(
                1,
                null,
                null
        );
        assertThat(executeSolution(root)).isEqualTo(List.of(1));
    }

    private List<Integer> executeSolution(BinaryTreeInorderTraversal_94.TreeNode treeNode) {
        return new BinaryTreeInorderTraversal_94().inorderTraversal(treeNode);
    }
}