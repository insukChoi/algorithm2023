package com.muzi.algorithm.leetcode;

/**
 * 111. Minimum-depth-of-binary-tree
 *
 * @see <a href="https://leetcode.com/problems/minimum-depth-of-binary-tree/">minimum-depth-of-binary-tree</a>
 */
public class MinimumDepthOfBinaryTree_111 {

    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        if (root.left == null) return 1 + minDepth(root.right);
        if (root.right == null) return 1 + minDepth(root.left);
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
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
