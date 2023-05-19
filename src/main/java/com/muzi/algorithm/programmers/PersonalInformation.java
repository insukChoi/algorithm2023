package com.muzi.algorithm.programmers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;


/**
 * 2023 KAKAO BLIND RECRUITMENT > 개인정보 수집 유효기간
 * @see <a href="https://school.programmers.co.kr/learn/courses/30/lessons/150370">개인정보 수집 유효기간</a>
 */
public class PersonalInformation {

    private static final String EMPTY_STRING = " ";

    public int[] solution(String today, String[] terms, String[] privacies) {
        final ArrayList<Integer> answerList = new ArrayList<>();

        LocalDate localToday = convertLocalDateWithBasicIsoDate(today);
        for (int i = 0; i < privacies.length; i++) {
            final String targetDate = privacies[i].split(EMPTY_STRING)[0];
            final String targetCharacter = privacies[i].split(EMPTY_STRING)[1];

            if (expiredDate(terms, targetDate, targetCharacter)
                    .isBefore(localToday)) {
                answerList.add(i+1);
            }
        }

        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }


    /**
     * 주어진 파라미터에서 예상되는 만료 일자를 구한다.
     *
     * @param terms = ["A 6", "B 12", "C 3"]
     * @param targetDate = "YYYY.MM.DD"
     * @param targetCharacter = "A"
     */
    private LocalDate expiredDate(final String[] terms, final String targetDate, final String targetCharacter) {
        return convertLocalDateWithBasicIsoDate(targetDate)
                .plusMonths(getTermsMonth(terms, targetCharacter))
                .minusDays(1);
    }

    /**
     * terms = ["A 6", "B 12", "C 3"] 처럼 [targetCharacter, month] 형식에서
     * targetCharacter 에 맞는 month 를 찾아 return 한다.
     */
    private long getTermsMonth(final String[] terms, final String targetCharacter) {
        return Long.parseLong(Arrays.stream(terms)
                .filter(it -> it.contains(targetCharacter))
                .map(it -> it.split(EMPTY_STRING)[1])
                .findFirst()
                .get()
        );
    }

    /**
     * YYYY.MM.DD 형식의 String 을 LocalDate 로 변환한다.
     *
     * @param today = YYYY.MM.DD
     */
    private static LocalDate convertLocalDateWithBasicIsoDate(final String today) {
        return LocalDate.parse(today.replaceAll("\\.", ""), DateTimeFormatter.BASIC_ISO_DATE);
    }
}
