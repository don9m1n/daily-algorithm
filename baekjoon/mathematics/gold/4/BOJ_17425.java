package baekjoon.mathmatics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 약수의 합
public class BOJ_17425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        long[] fx = new long[1000001];
        long[] gx = new long[1000001];

        Arrays.fill(fx, 1);

        for (int i = 2; i < 1000001; i++) {
            for (int j = 1; i * j < 1000001; j++) {
                fx[i * j] += i;
            }
        }

        for (int i = 1; i < 1000001; i++) {
            gx[i] = gx[i - 1] + fx[i];
        }

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            sb.append(gx[Integer.parseInt(br.readLine())]).append("\n");
        }

        System.out.println(sb);
    }
}
