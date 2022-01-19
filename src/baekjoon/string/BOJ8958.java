package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// OX 퀴즈
public class BOJ8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String str = br.readLine();
            int score = 0;
            int subSum = 0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == 'O') {
                    subSum += 1;
                }else {
                    subSum = 0;
                }
                score += subSum;
            }
            System.out.println(score);
        }
    }
}
