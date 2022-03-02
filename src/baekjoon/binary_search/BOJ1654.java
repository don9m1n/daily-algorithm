package baekjoon.binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 랜선 자르기
public class BOJ1654 {

    static int k;
    static int n;
    static int[] cable;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        cable = new int[k];
        long max = 0;
        for (int i = 0; i < k; i++) {
            cable[i] = Integer.parseInt(br.readLine());
            max = Math.max(cable[i], max);
        }


        long min = 1;
        long mid = 0;
        while (min <= max) {
            mid = (min + max) / 2;

            int count = 0;
            for (int c : cable) {
                count += (c / mid);
            }

            if (count >= n) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        System.out.println(max);
    }
}
