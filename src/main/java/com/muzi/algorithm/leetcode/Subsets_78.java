package com.muzi.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 78. Subsets
 * @see <a href="https://leetcode.com/problems/subsets/">subsets</a>
 */
public class Subsets_78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtracking(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private void backtracking(List<List<Integer>> result, List<Integer> subset, int[] nums, int start) {
        result.add(new ArrayList<>(subset));
        for (int i = start; i < nums.length; i++) {
            subset.add(nums[i]);
            backtracking(result, subset, nums, i + 1);
            subset.remove(subset.size() - 1);
        }
    }
}
