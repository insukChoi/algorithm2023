package com.muzi.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 94. Binary Tree Inorder Traversal
 *
 * @see <a href="https://leetcode.com/problems/binary-tree-inorder-traversal">binary-tree-inorder-traversal</a>
 */
public class BinaryTreeInorderTraversal_94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return Collections.emptyList();

        return makeInorder(root, new ArrayList<>());
    }

    private List<Integer> makeInorder(final TreeNode node, final ArrayList<Integer> answerList) {
        if (node.left != null) makeInorder(node.left, answerList);
        answerList.add(node.val);
        if (node.right != null) makeInorder(node.right, answerList);
        return answerList;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
