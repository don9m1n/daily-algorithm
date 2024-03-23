package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 거스름돈
public class BOJ5585 {

    static int[] yen = {500, 100, 50, 10, 5, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int change = 1000 - n;
        int cnt = 0;
        for (int i = 0; i < yen.length; i++) {
            while (change >= yen[i]) {
                change -= yen[i];
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}
