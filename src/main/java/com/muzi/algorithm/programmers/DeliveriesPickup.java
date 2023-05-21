package com.muzi.algorithm.programmers;

/**
 * 2023 KAKAO BLIND RECRUITMENT > 택배 배달과 수거하기
 * @see <a href="https://school.programmers.co.kr/learn/courses/30/lessons/150369">택배 배달과 수거하기</a>
 */
public class DeliveriesPickup {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        int answer = 0;

        for(int i = n-1 ; i >-1 ; i--){
            while (deliveries[i] > 0 || pickups[i] > 0){
                deliveries[i] -= cap;
                pickups[i] -= cap;
                answer = answer + (2 * (i + 1));
            }

            if(i==0) break;

            if(deliveries[i] < 0){
                deliveries[i-1] += deliveries[i];
            }

            if(pickups[i] < 0){
                pickups[i-1] += pickups[i];
            }
        }

        return answer;
    }
}
