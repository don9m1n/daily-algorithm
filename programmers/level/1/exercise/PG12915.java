package programmers.level1.success;

import java.util.Arrays;
import java.util.Comparator;

// 문자열 내 마음대로 정렬하기
// n번째 인덱스의 문자를 기준으로 문자를 정렬
public class PG12915 {
    public static void main(String[] args) {
        String[] solution = solution(new String[]{"sun", "bed", "car"}, 1);
        System.out.println(Arrays.toString(solution));
    }

    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.charAt(n) == o2.charAt(n)) {
                    return o1.compareTo(o2);
                }
                return o1.charAt(n) - o2.charAt(n);
            }
        });

        return strings;
    }
}
