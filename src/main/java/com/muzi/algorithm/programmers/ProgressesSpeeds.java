package com.muzi.algorithm.programmers;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 스택/큐 > 기능개발
 * @see <a href="https://school.programmers.co.kr/learn/courses/30/lessons/42586">기능개발</a>
 */
public class ProgressesSpeeds {
    public int[] solution(int[] progresses, int[] speeds) {

        final Queue<Integer> progressQueue = Arrays.stream(progresses).boxed().collect(Collectors.toCollection(LinkedList::new));
        final Queue<Integer> speedsQueue = Arrays.stream(speeds).boxed().collect(Collectors.toCollection(LinkedList::new));

        int times = 1;
        final ArrayList<Integer> timeLists = new ArrayList<>();
        while (!progressQueue.isEmpty()) {
            final Integer progress = progressQueue.poll();
            final Integer speed = speedsQueue.poll();

            while (progress + (speed * times) < 100) times ++;
            timeLists.add(times);
        }

        Map<Integer, Integer> duplicateCountMap = timeLists.stream()
                .collect(
                        Collectors.toMap(Function.identity(), time -> 1, Math::addExact, TreeMap::new)
                );

        return duplicateCountMap.values().stream().mapToInt(Integer::intValue).toArray();
    }
}
