package com.muzi.algorithm.leetcode;

/**
 * 35. Search Insert Position
 * @see [search-insert-position](https://leetcode.com/problems/search-insert-position/)
 */
public class SearchInsertPosition_35 {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;

        while (low <= high) {
            mid = (low + high) / 2;
            if (nums[mid] == target) break;
            else if (nums[mid] < target){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (nums[mid] == target) return mid;
        if (nums[mid] < target) return mid + 1;
        else return mid;
    }
}
