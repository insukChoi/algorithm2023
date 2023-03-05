package com.muzi.algorithm.leetcode;

import java.util.Arrays;

/**
 * 621. Task Scheduler
 *
 * @see [Task Scheduler](https://leetcode.com/problems/task-scheduler/)
 */
public class TaskScheduler_621 {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for (char task : tasks) {
            freq[task - 'A']++;
        }

        Arrays.sort(freq);

        int maxFreq = freq[25] - 1;
        int idleTime = maxFreq * n;

        for (int i = 24; i >= 0 && freq[i] > 0; i--) {
            idleTime -= Math.min(maxFreq, freq[i]);
        }

        return Math.max(tasks.length, tasks.length + idleTime);
    }
}
