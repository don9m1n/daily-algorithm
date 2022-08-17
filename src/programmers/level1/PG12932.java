package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 자연수 뒤집어 배열로 만들기
public class PG12932 {
    public static void main(String[] args) {
        long[] solution = solution(12345);
        System.out.println(Arrays.toString(solution));
    }

    public static long[] solution(long n) {
        List<Long> num = new ArrayList<>();

        while (n > 0) {
            num.add(n % 10);
            n /= 10;
        }

        return num.stream().mapToLong(i -> i).toArray();
    }
}