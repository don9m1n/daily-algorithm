package programmers.level1.success;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

// 문자열 내림차순으로 정렬하기
public class PG12917 {
    public static void main(String[] args) {
        String solution = solution("Zbcdefg");
        System.out.println("solution = " + solution);
    }

    public static String solution(String s) {
        String[] arr = s.split("");
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        StringBuilder sb = new StringBuilder();
        Stream.of(arr).forEach(str -> sb.append(str));

        return sb.toString();
    }
}
