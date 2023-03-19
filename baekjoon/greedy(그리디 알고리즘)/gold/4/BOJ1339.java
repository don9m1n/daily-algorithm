package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 단어 수학 [골드4]
public class BOJ1339 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] alpha = new int[26];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                alpha[str.charAt(j) - 65] += Math.pow(10, str.length() - j - 1);
            }
        }

        Arrays.sort(alpha);

        int sum = 0;
        int index = 9;
        for (int i = alpha.length - 1; i >= 0; i--) {
            if (alpha[i] == 0) {
                break;
            }

            sum += alpha[i] * index--;
        }

        System.out.println(sum);
    }
}
