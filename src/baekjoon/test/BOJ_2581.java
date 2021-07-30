package baekjoon.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 소수
public class BOJ_2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = N;
        for(int i = M; i <= N; i++) {
            if(i == 1) continue;
            boolean check = true;
            for(int j = 2; j <= i; j++) {
                if((j < i) && (i % j) == 0) {
                    check = false;
                    break;
                }
            }

            if(check) {
                sum += i;
                min = Math.min(min, i);
            }
        }

        if(sum == 0) {
            System.out.println(-1);
        }else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
