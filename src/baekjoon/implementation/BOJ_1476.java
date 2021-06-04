package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 날짜 계산
public class BOJ_1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int year = 1;
        int E1 = 1;
        int S1 = 1;
        int M1 = 1;

        while(true) {
            if(E1 == E && S1 == S && M1 == M) {
                System.out.println(year);
                break;
            }
            E1++;
            S1++;
            M1++;

            if(E1 > 15) E1 = 1;
            if(S1 > 28) S1 = 1;
            if(M1 > 19) M1 = 1;

            year++;
        }
    }
}
