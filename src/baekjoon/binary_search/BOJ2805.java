package baekjoon.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2805 {

    static int max;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()); // 나무의 수
        int m = Integer.parseInt(st.nextToken()); // 가져갈 나무의 길이

        int[] trees = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, trees[i]);
        }

        long left = 0; // 제일 낮은 나무
        long right = max; // 제일 높은 나무

        while(left <= right) {
            long mid = (left + right) / 2;
            long sum = 0;

            for (int tree : trees) {
                if(tree > mid) { // 중간값보다 큰 경우 자를 수 있는 나무의 길이를 sum에 더해줌
                    sum += (tree - mid);
                }
            }

            if(sum >= m) { // sum이 m보다 크면 범위를 하나 높여줘야함
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        System.out.println(right);
    }
}
