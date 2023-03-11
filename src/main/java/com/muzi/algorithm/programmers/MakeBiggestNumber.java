package com.muzi.algorithm.programmers;

/**
 * 탐욕법 > 큰 수 만들기
 * @see <a href="https://school.programmers.co.kr/learn/courses/30/lessons/42883?language=java">큰 수 만들기</a>
 */
public class MakeBiggestNumber {
    public String solution(final String number, final int k) {
        StringBuilder answer = new StringBuilder();
        char[] numbers = number.toCharArray();

        for (int i = 0, index = -1; i < (numbers.length - k); i++)        {
            char maxNum = 0;
            for (int j = index + 1; j <= k + i; j++){
                if (maxNum < numbers[j]){
                    index = j;
                    maxNum = numbers[j];
                }
            }
            answer.append(maxNum);
        }

        return answer.toString();
    }
}
