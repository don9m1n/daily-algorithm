package baekjoon.greedy.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 수들의 합
public class BOJ_1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long S = Long.parseLong(br.readLine());
        int N = 0;

        int i = 1;
        while(S > 0) {
            if(S < i) break;
            S -= i;
            N++;
            i++;
        }

        System.out.println(N);
    }
}
