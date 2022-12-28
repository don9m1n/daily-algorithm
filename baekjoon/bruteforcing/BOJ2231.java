package baekjoon.bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 분해합
public class BOJ2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i < n; i++) {
            int sum = i;

            int num = i;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            if(n == sum) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}
