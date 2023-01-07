package com.muzi.algorithm.programmers;

/**
 * 동적계획법(Dynamic Programming) 정수 삼각형
 * @see <a href="https://school.programmers.co.kr/learn/courses/30/lessons/43105">동적계획법(Dynamic Programming) 정수 삼각형</a>
 */
public class IntegerTriangle {
    public int solution(int[][] triangle) {
        int answer = 0;
        int len = triangle.length;
        for (int i = 1; i < len; i++) {
            for (int j = 0; j <= i; j++) {
                if(j == 0) {
                    triangle[i][j] = triangle[i][j] + triangle[i-1][j];
                }
                else if(j==i) {
                    triangle[i][j] = triangle[i][j] + triangle[i-1][j-1];
                }
                else {
                    triangle[i][j] = Math.max(triangle[i][j]+triangle[i-1][j-1],triangle[i][j]+triangle[i-1][j]);
                }
            }
        }
        for(int i : triangle[len-1]) {
            answer = Math.max(answer, i);
        }

        return answer;
    }
}
