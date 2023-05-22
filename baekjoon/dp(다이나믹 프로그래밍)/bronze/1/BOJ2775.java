package baekjoon.dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 부녀회장이 될테야
public class BOJ2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int[][] apt = new int[15][15];
        for (int i = 1; i < 15; i++) {
            apt[0][i] = i;
            apt[i][1] = 1;
        }

        for (int i = 1; i < 15; i++) {
            for (int j = 2; j < 15; j++) {
                apt[i][j] = apt[i][j - 1] + apt[i - 1][j];
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            sb.append(apt[k][n]).append("\n");
        }

        System.out.println(sb);
    }
}
