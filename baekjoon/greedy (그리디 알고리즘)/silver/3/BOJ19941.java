package baekjoon.Greedy.silver.tier3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 햄버거 분배
public class BOJ19941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String[] hamburger = br.readLine().split("");

        int count = 0;
        for (int i = 0; i < hamburger.length; i++) {
            if (hamburger[i].equals("P")) {
                for (int j = i - k; j <= i + k; j++) {
                    if (j >= 0 && j < n) {
                        if (hamburger[j].equals("H")) {
                            hamburger[j] = "X";
                            count++;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(count);


    }
}
