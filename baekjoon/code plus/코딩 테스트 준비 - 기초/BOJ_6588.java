package baekjoon.codeplus.cp9370;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 골드바흐의 추측
public class BOJ_6588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int MAX_SIZE = 1000000;
        boolean[] isPrime = new boolean[MAX_SIZE + 1];
        Arrays.fill(isPrime, true);

        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i <= Math.sqrt(MAX_SIZE); i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= MAX_SIZE; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        String line = "";
        while (!(line = br.readLine()).equals("0")) {
            int n = Integer.parseInt(line);

            boolean flag = false;
            for (int i = 3; i <= n / 2; i += 2) {
                if (isPrime[i] && isPrime[n - i]) {
                    System.out.println(n + " = " + i + " + " + (n - i));
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                System.out.println("Goldbach's conjecture is wrong.");
            }
        }
    }
}
