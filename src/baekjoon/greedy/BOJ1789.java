package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 수들의 합
 * feedback: 이분탐색 정리, 타입별 값 범위 주의해서 풀기
  */
public class BOJ1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long s = Long.parseLong(br.readLine());

        System.out.println(search(s));
        System.out.println(binarySearch(s));
    }

    // 이분 탐색
    private static long binarySearch(long s) {

        long start = 1;
        long end = s;
        long result = 0;

        // mid * (mid + 1) / 2 => 1 ~ mid 까지의 합
        while(start <= end) {
            long mid = (start + end) / 2;
            if(mid * (mid + 1) / 2 <= s) {
                result = mid;
                start = mid + 1;
            } else if(mid * (mid + 1) / 2 > s) {
                end = mid - 1;
            }
        }
        return result;
    }

    private static int search(long s) {
        long sum = 0;
        int i = 1;
        while (sum < s) {
            sum += i;
            i++;
        }

        return i - 2;
    }
}
