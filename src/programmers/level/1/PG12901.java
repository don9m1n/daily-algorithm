package programmers.level1;

import java.time.LocalDate;

// 2016년
public class PG12901 {
    public static void main(String[] args) {
        String solution = solution(5, 24);
        System.out.println("solution = " + solution);
    }

    public static String solution(int a, int b) {
        LocalDate date = LocalDate.of(2016, a, b);
        String day = date.getDayOfWeek().name();
        return day.substring(0, 3);
    }
}
