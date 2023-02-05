package com.muzi.algorithm.programmers;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 깊이/너비 우선 탐색(DFS/BFS) > 단어 변환
 *
 * @see [단어 변환](https://school.programmers.co.kr/learn/courses/30/lessons/43163)
 */
public class BeginTargetWords {
    private int answer;
    public int solution(String begin, String target, String[] words) {
        answer = words.length + 1;
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(words));
        if (!arrayList.contains(target)){
            return 0;
        }
        searchWord(begin, begin, target, arrayList, 0);
        return answer;
    }

    public void searchWord(String past, String current, String target, ArrayList<String> arrayList, int count){
        if (current.equals(target)){
            answer = Math.min(answer, count);
        } else {
            ArrayList<String> wordArrayList = new ArrayList<>(arrayList);
            wordArrayList.remove(past);
            for (String word : wordArrayList){
                if (canTransfer(current, word)){
                    searchWord(current, word, target, wordArrayList, count + 1);
                }
            }
        }
    }

    public boolean canTransfer(final String begin, final String word) {
        return begin.chars().filter(beginChar -> word.chars().noneMatch(wordChar -> wordChar == beginChar)).count() == 1;
    }
}
