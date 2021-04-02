package baekjoon.level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int sum = 0;
        int result = 0;

        int N = Integer.parseInt(st.nextToken()); // 카드 개수
        int M = Integer.parseInt(st.nextToken()); // 카드의 최대 합

        int[] cards = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N-2; i++) {
            for (int j = i+1; j < N-1; j++) {
                for (int k = j+1; k < N; k++) {
                    sum = cards[i] + cards[j] + cards[k];

                    //  최대값이 M과 같은 경우
                    if(M == sum) {
                        result = sum;
                    }

                    // 최대값이 M보다 작은 경우
                    if(result < sum && sum < M) {
                        result = sum;
                    }
                }
            }
        }
        System.out.println(result);
    }
}