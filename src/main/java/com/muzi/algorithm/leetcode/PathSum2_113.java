package com.muzi.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 113. Path Sum II
 * @see [path-sum-ii](https://leetcode.com/problems/path-sum-ii/)
 */
public class PathSum2_113 {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> answerList = new ArrayList<>();
        dfs(root, targetSum, new ArrayList<>(), answerList);
        return answerList;
    }

    private void dfs(TreeNode root, int targetSum, List<Integer> path, List<List<Integer>> answerList) {
        if (root == null)
            return;
        if (root.val == targetSum && root.left == null && root.right == null) {
            path.add(root.val);
            answerList.add(new ArrayList<>(path));
            path.remove(path.size() - 1);
            return;
        }

        path.add(root.val);
        dfs(root.left, targetSum - root.val, path, answerList);
        dfs(root.right, targetSum - root.val, path, answerList);
        path.remove(path.size() - 1);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
