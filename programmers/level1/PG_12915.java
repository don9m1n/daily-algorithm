package progammers.level1;

import java.util.Arrays;
import java.util.Comparator;

// 문자열 내 마음대로 정렬하기
public class PG_12915 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"sun", "bed", "car"}, 1)));
        System.out.println(Arrays.toString(solution(new String[]{"abce", "abcd", "cdx"}, 2)));
    }

    static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (o1, o2) -> {
            if (o1.charAt(n) == o2.charAt(n)) {
                return o1.compareTo(o2);
            }
            return o1.charAt(n) - o2.charAt(n);
        });
        return strings;
    }
}
