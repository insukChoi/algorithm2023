package com.muzi.algorithm.programmers;

import java.util.PriorityQueue;

/**
 * 힙(Heap) > 더 맵게
 * @see <a href="https://school.programmers.co.kr/learn/courses/30/lessons/42626?language=java">더 맵게</a>
 */
public class Scoville {

    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int answer = 0;

        for (int i = 0; i < scoville.length; i++) {
            pq.add(scoville[i]);
        }
        // pq = 1, 2, 3, 9, 10, 12
        while (!pq.isEmpty()) {
            int first = pq.poll();

            if (first < K) {
                if (pq.size() == 0) {
                    return -1;
                }
                int second = pq.poll();
                int sum = scoville(first, second);
                pq.add(sum);
                answer++;
            }
        }
        return answer;
    }


//    public int solution(int[] scoville, int K) {
//        int answer = 0;
//
//        List<Integer> sortedList = new ArrayList<>();
//        for (int i : scoville) {
//            sortedList.add(i);
//        }
//        sortedList.sort(Integer::compareTo);
//
//        while (sortedList.get(0) < K) {
//            int element = scoville(sortedList.get(0), sortedList.get(1));
//            answer++;
//            sortedList.remove(0);
//            sortedList.remove(0);
//            sortedList.add(element);
//            sortedList.sort(Integer::compareTo);
//            if (sortedList.get(0) >= K) break;
//        }
//
//        return answer;
//    }

    private int scoville(final Integer first, final Integer second) {
        return first + (second * 2);
    }
}
