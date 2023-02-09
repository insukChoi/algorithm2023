package com.muzi.algorithm.leetcode;

/**
 * 34. Find First and Last Position of Element in Sorted Array
 * @see [find-first-and-last-position-of-element-in-sorted-array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)
 */
public class FindFirstLastPositionOfElement_34 {
    public int[] searchRange(int[] nums, int target) {
        final int firstIndex = firstIndex(nums, target);
        final int lastIndex = lastIndex(nums, target);
        return new int[]{firstIndex, lastIndex};
    }

    private int firstIndex(final int[] nums, final int target) {
        int returnIndex = -1;
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target){
                returnIndex = mid;
                high = mid - 1;
            }
            else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return returnIndex;
    }

    private int lastIndex(final int[] nums, final int target) {
        int returnIndex = -1;
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target){
                returnIndex = mid;
                low = mid + 1;
            }
            else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return returnIndex;
    }
}
