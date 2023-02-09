package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 로프
public class BOJ2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] rope = new int[n];
        for (int i = 0; i < n; i++) {
            rope[i] = Integer.parseInt(br.readLine());
        }

        /**
         * 각 케이스별 들 수 있는 최대 무게
         * 가장 작은 로프 * n
         */
        // 퀵 정렬!
        m_pivot_sort(rope, 0, rope.length - 1);

        int max = 0;
        for (int i = n - 1; i >= 0; i--) {
            max = Math.max(max, rope[i] * (n - i));
        }
        System.out.println(max);
    }

    private static void m_pivot_sort(int[] rope, int lo, int hi) {

        // lo >= hi 인 경우에는 원소가 1개 이하기 때문에 정렬할 필요가 없음
        if (lo >= hi) {
            return;
        }

        int pivot = partition(rope, lo, hi);

        m_pivot_sort(rope, lo, pivot);
        m_pivot_sort(rope, pivot + 1, hi);
    }

    private static int partition(int[] rope, int left, int right) {

        int lo = left;
        int hi = right;
        int pivot = rope[((left - 1) + (right + 1)) / 2];

        while (true) {

            while(rope[lo] < pivot) {
                lo++;
            }

            while(rope[hi] > pivot && lo <= hi) {
                hi--;
            }

            // lo < hi를 만족하지 않으면 hi 리턴
            if(lo >= hi) {
                return hi;
            }

            // lo < hi를 만족하면 스왑
            swap(rope, lo, hi);
        }
    }

    private static void swap(int[] rope, int lo, int hi) {
        int temp = rope[lo];
        rope[lo] = rope[hi];
        rope[hi] = temp;
    }
}
