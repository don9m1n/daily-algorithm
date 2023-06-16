package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_10162 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] cnt = {0, 0, 0};
        int[] btns = {300, 60, 10};

        int T = Integer.parseInt(br.readLine());

        int i = 0;
        while (T > 0) {
            // 시간을 정확히 맞출 수 없는 경우에는 -1 return!!
            if (T % 10 != 0) {
                System.out.println(-1);
                return;
            }

            while (T >= btns[i]) {
                T -= btns[i];
                cnt[i]++;
            }
            i++;
        }
        for (int j : cnt) {
            System.out.printf("%d ", j);
        }
    }
}