package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 카드 합체 놀이
// FEEDBACK: 최대값을 int로 담지 못할 수도 있기 때문에 long type을 사용해야한다. -> type 범위 체크 잘하기
public class BOJ_15903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); // 카드의 개수
        int m = Integer.parseInt(st.nextToken()); // 카드 합체 횟수
        long[] cards = new long[N];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<m; i++) {
            Arrays.sort(cards);
            long sum = cards[0] + cards[1];
            cards[0] = sum;
            cards[1] = sum;
        }

        int result = 0;
        for (long card : cards) {
            result += card;
        }

        System.out.println(result);
    }
}
