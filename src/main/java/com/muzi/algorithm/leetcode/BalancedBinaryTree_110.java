package com.muzi.algorithm.leetcode;

/**
 * 110. Balanced Binary Tree
 *
 * @see <a href="https://leetcode.com/problems/balanced-binary-tree/">balanced-binary-tree</a>
 */
public class BalancedBinaryTree_110 {

    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;

        int left = getHeight(root.left);
        int right = getHeight(root.right);

        if (Math.abs(left - right) > 1) return false;
        else return isBalanced(root.left) && isBalanced(root.right);
    }
    private int getHeight(TreeNode node) {
        if(node == null) return 0;
        return Math.max(getHeight(node.left), getHeight(node.right)) + 1;
    }

    static public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

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
