package baekjoon.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 지능형 기차
public class BOJ_2460 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0; // 최대 탑승 인원
        int person = 0;
        for(int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int down = Integer.parseInt(st.nextToken()); // 내린 사람
            int up = Integer.parseInt(st.nextToken());

            person += (up - down);
            if(person > max) {
                max = person;
            }
        }

        System.out.println(max);
    }
}
