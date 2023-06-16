package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

// 30
public class BOJ10610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();

        int length = n.length();
        int[] count = new int[10]; // 0 ~ 9
        long total = 0;

        for (int i = 0; i < length; i++) {
            int num = Integer.parseInt(n.substring(i, i + 1));
            count[num]++;
            total += num;
        }

        /**
         * 30의 배수가 되기 위한 조건: 0이 포함되어 있거나 숫자의 각 자릿수의 합이 3의 배수여야함
         */
        if (!n.contains("0") || total % 3 != 0) {
            System.out.println(-1);
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            while(count[i] > 0) {
                sb.append(i);
                count[i]--;
            }
        }
        System.out.println(sb.toString());
    }
}