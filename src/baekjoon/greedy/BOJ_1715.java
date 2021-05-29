package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 카드 정렬하기
public class BOJ_1715 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] cards = new int[N];

        for(int i=0; i<N; i++) {
            cards[i] = Integer.parseInt(br.readLine());
        }

        if(N == 0) {
            System.out.println(0);
            return;
        }

        Arrays.sort(cards);

        long sum = 0;
        long cnt = 0; // 카드 비교 횟수

        int i = 0;
        while(i < N) {
            if(i==0) {
                sum = cards[i] + cards[i+1];
                cnt = sum;
                i+=2;
            }
            sum += cards[i];
            cnt += sum;
            i++;
        }
        System.out.println(cnt);
    }
}
