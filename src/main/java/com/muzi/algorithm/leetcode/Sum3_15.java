package com.muzi.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 15. 3Sum
 *
 * @see <a href="https://leetcode.com/problems/3sum/">3Sum</a>
 */
public class Sum3_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        answer.add(List.of(nums[i], nums[j], nums[k]));
                    }
                }
            }
        }

        final Set<List<Integer>> collectSet = answer.stream()
                .map(
                        it -> it.stream().sorted().toList()
                ).collect(Collectors.toSet());

        return collectSet.stream().toList();
    }
}
