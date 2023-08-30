package baekjoon.greedy.bronze.tier1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 컵홀더
public class BOJ2810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String seat = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (seat.charAt(i) == 'S') {
                sb.append("*S");
            } else {
                sb.append("*LL");
                i++;
            }
        }
        sb.append("*");

        int count = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '*') {
                count++;
            }
        }

        System.out.println(Math.min(count, n));
    }
}
