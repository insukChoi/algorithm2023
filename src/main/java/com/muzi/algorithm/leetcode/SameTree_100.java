package com.muzi.algorithm.leetcode;

/**
 * 100. same-tree
 *
 * @see <a href="https://leetcode.com/problems/same-tree/">same-tree</a>
 */
public class SameTree_100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return isEquals(p, q);
    }

    private boolean isEquals(final TreeNode p, final TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        return isEquals(p.left, q.left) && isEquals(p.right, q.right);
    }

    public static class TreeNode {
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
