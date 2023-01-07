package com.muzi.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 46. Permutations
 * @see <a href="https://leetcode.com/problems/permutations/">permutations</a>
 */
public class Permutations_46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> perimuteList = new ArrayList<>();
        permutations(nums, perimuteList, new ArrayList<>());
        return perimuteList;
    }

    /**
     *
     * @param nums : 현재 target Num
     * @param perimuteList : perimute 조합 List
     * @param list : temp Number List
     */
    private void permutations(final int[] nums, final List<List<Integer>> perimuteList, List<Integer> list) {
        if (list.size() == nums.length) {
            perimuteList.add(new ArrayList<>(list));
            return;
        }

        for (int num : nums) {
            if (list.contains(num)) continue;

            list.add(num);
            permutations(nums, perimuteList, list);
            list.remove(list.size() - 1);
        }
    }
}
