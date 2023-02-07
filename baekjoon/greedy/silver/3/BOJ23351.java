package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 물주기
public class BOJ23351 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken()); // 하루에 물을 줄 연속된 화분의 개수
        int b = Integer.parseInt(st.nextToken()); // 수분의 증가량

        int[] catnip = new int[n];
        Arrays.fill(catnip, k);

        int day = 0;
        int idx = 0;

        catnip:
        while (true) {
            day++;
            if (idx == n) {
                idx = 0;
            }

            for (int i = idx; i < idx + a; i++) { // 연속된 화분에 물주기
                catnip[i] += b;
            }

            for (int i = 0; i < n; i++) { // 전체 화분 수분 -1
                catnip[i]--;
                if(catnip[i] == 0) {
                    break catnip;
                }
            }

            idx += a;
        }
        System.out.println(day);
    }
}
