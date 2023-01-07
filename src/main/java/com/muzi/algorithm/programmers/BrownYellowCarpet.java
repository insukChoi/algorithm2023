package com.muzi.algorithm.programmers;

/**
 * 완전탐색 > 카펫
 * @see <a href="https://school.programmers.co.kr/learn/courses/30/lessons/42842/">Brown Yellow Carpet</a>
 */
public class BrownYellowCarpet {
    public int[] solution(int brown, int yellow) {
        int row = (brown / 2) - 1;
        int column = 2; // 맨위 row 와 맨아래 row 는 default
        
        while (row > 0) {
            int tempBrown = brown - (row * 2);
            int tempYellow = yellow;

            while (tempYellow >= (row - 2)) {
                tempYellow -= (row - 2);
                tempBrown -= 2;
                column ++;
            }

            if (tempYellow == 0 && tempBrown == 0) break;
            column = 2;
            row--;
        }

        return new int[]{row, column};
    }
}
