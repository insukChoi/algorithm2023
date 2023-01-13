package com.muzi.algorithm.leetcode;

/**
 * 852. Peak Index in a Mountain Array
 * @see [peak-index-in-a-mountain-array](https://leetcode.com/problems/peak-index-in-a-mountain-array/)
 */
public class MountainArray_852 {
    public int peakIndexInMountainArray(int[] arr) {
        int lowIndex = 0;
        int highIndex = arr.length - 1;
        int midIndex = (lowIndex + highIndex) / 2;

        while (!isMountain(arr, midIndex)) {
            if(arr[midIndex] < arr[midIndex - 1]) {
                highIndex = midIndex;
            } else {
                lowIndex = midIndex;
            }
            midIndex = (lowIndex + highIndex) / 2;
        }

        return midIndex;
    }

    private boolean isMountain(final int[] arr, final int midIndex) {
        int tempIndex = midIndex;
        while (tempIndex != 0) {
            if (arr[tempIndex] < arr[tempIndex - 1]) return false;
            tempIndex--;
        }

        tempIndex = midIndex;
        while (tempIndex != arr.length - 1) {
            if (arr[tempIndex] < arr[tempIndex + 1]) return false;
            tempIndex ++;
        }

        return true;
    }
}
