package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        // N이 3보다 작으면 종료
        if(N < 3) {
            System.out.println("N값이 유효하지 않습니다. 종료합니다.");
            return;
        }

        while(N > 0) {
            if(N % 5 == 0) {
                cnt += N / 5;
                break;
            }else {
                N -= 3;
                cnt++;
            }

            if(N < 0) {
                cnt = -1;
                break;
            }
        }
        System.out.println(cnt);
    }
}
