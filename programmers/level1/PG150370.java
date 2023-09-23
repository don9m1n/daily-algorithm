package progammers.level1;

import java.time.LocalDate;
import java.util.*;

// 개인정보 수집 유효기간
public class PG150370 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(
                "2022.05.19",
                new String[]{"A 6", "B 12", "C 3"},
                new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"})
        ));

        System.out.println(Arrays.toString(solution(
                "2020.01.01",
                new String[]{"Z 3", "D 5"},
                new String[]{"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"})
        ));

        System.out.println(Arrays.toString(solution(
                "2020.12.17",
                new String[]{"A 12"},
                new String[]{"2010.01.01 A", "2019.12.17 A"})
        ));
    }

    static int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String term : terms) {
            map.put(term.split(" ")[0], Integer.parseInt(term.split(" ")[1]));
        }

        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < privacies.length; i++) {
            String[] privacy = privacies[i].split(" ");
            String[] startDate = privacy[0].split("\\.");
            String termsType = privacy[1];

            int startDay = Integer.parseInt(startDate[2]);
            int startMonth = Integer.parseInt(startDate[1]);
            int startYear = Integer.parseInt(startDate[0]);

            int newDay = startDay == 1 ? 28 : startDay - 1;
            int newMonth = newDay == 28 ? startMonth + map.get(termsType) - 1 : startMonth + map.get(termsType);
            int newYear = startYear;

            if(newMonth > 12) {
                if(newMonth % 12 == 0) {
                    newYear += newMonth / 12 - 1;
                    newMonth = 12;
                } else {
                    newYear += newMonth / 12;
                    newMonth = newMonth % 12;
                }
            }

            LocalDate expired = LocalDate.of(newYear, newMonth, newDay);

            String[] todayArr = today.split("\\.");
            int year = Integer.parseInt(todayArr[0]);
            int month = Integer.parseInt(todayArr[1]);
            int day = Integer.parseInt(todayArr[2]);

            LocalDate now = LocalDate.of(year, month, day);

            if (expired.isBefore(now)) {
                answer.add(i + 1);
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
