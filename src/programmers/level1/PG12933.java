package programmers.level1.success;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// 정수 내림차순으로 배치하기
public class PG12933 {
    public static void main(String[] args) {
        long solution = solution(118372);
        System.out.println("solution = " + solution);
    }

    public static long solution(long n) {
        List<Long> list = new ArrayList<>();

        while(n > 0) {
            list.add(n % 10);
            n /= 10;
        }

        list.sort(new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                return o2.compareTo(o1);
            }
        });

        long result = 0;
        for (Long num : list) {
            result = (result * 10) + num;
        }

        return result;
    }
}
