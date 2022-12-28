package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 상수
public class BOJ2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int result = Math.max(reverse(a), reverse(b));
        System.out.println(result);
    }

    private static int reverse(int num) {
        int sum = 0;
        while(num > 0) {
            sum = (sum * 10) + (num % 10);
            num /= 10;
        }
        return sum;
    }
}
