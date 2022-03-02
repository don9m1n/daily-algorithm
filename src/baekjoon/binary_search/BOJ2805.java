package baekjoon.binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 나무자르기
public class BOJ2805 {

    static int n;
    static int m;
    static int[] tree;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken()); // 가져가려고 하는 나무의 길이

        tree = new int[n];
        int hi = 0; // 최대 높이
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            tree[i] = Integer.parseInt(st.nextToken());
            if (tree[i] > hi) {
                hi = tree[i];
            }
        }

        int lo = 0; // 시작 높이
        while (lo + 1 < hi) {
            int mid = (lo + hi) / 2;

            if (isCheck(mid)) {
                lo = mid;
            } else {
                hi = mid;
            }
            System.out.println("lo = " + lo);
            System.out.println("hi = " + hi);
            System.out.println("=================");
        }
        System.out.println(lo);
    }

    private static boolean isCheck(int mid) {
        long sum = 0;
        long treeHeight = 0;

        for (int t : tree) {
            if (t > mid) {
                treeHeight = t - mid;
                sum += treeHeight;
            }
        }

        return sum == m || sum > m;
    }
}
