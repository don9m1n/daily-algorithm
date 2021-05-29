package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

// 카드 정렬하기
public class BOJ_1715 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Long> cards = new PriorityQueue<Long>();

        for(int i=0; i<N; i++) {
            cards.add(Long.parseLong(br.readLine()));
        }

        long sum = 0;
        while(cards.size() > 1) {
            long temp1 = cards.poll();
            long temp2 = cards.poll();

            sum += temp1 + temp2;
            cards.add(temp1 + temp2);
        }
        System.out.println(sum);
    }
}
