package baekjoon.bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 완전제곱수
public class BOJ1977 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = Integer.MAX_VALUE;

        int sqrt = (int) Math.sqrt(m);
        while (Math.pow(sqrt, 2) <= n) {
            int squareNumber = (int) Math.pow(sqrt, 2);
            if (squareNumber >= m && squareNumber <= n) {
                sum += squareNumber;
                min = Math.min(min, squareNumber);
            }
            sqrt++;
        }

        if(sum == 0) {
            System.out.println(-1);
            return;
        }
        System.out.println(sum);
        System.out.println(min);
    }
}