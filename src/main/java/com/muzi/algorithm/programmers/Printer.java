package com.muzi.algorithm.programmers;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 스택/큐 > 프린터
 * @see <a href="https://school.programmers.co.kr/learn/courses/30/lessons/42587">프린터</a>
 */
public class Printer {
    /**
     * priorities	        location	return
     * [1, 1, 9, 1, 1, 1]	    0	    5
     */
    public int solution(int[] priorities, int location) {
        final Queue<Integer> progressQueue = Arrays.stream(priorities).boxed().collect(Collectors.toCollection(LinkedList::new));

        int removeCnt = 0;
        while (!progressQueue.isEmpty()) {
            final Integer element = progressQueue.poll();
            location --;

            if (!isMax(element, progressQueue)) {
                progressQueue.add(element);
                if (location == -1) location += progressQueue.size();
            } else {
                removeCnt++;
            }
            if (location == -1) break;
        }

        return removeCnt;
    }

    private boolean isMax(final Integer element, final Queue<Integer> progressQueue) {
        for (Integer current : progressQueue) {
            if (element < current) return false;
        }
        return true;
    }
}
