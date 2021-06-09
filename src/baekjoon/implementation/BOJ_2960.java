package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 에라토스테네스의 체
public class BOJ_2960 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        boolean[] primeNum = new boolean[N+1];

        for(int i = 2; i <= N; i++) {
            primeNum[i] = true;
        }

        int result = isCheck(primeNum, N, K);
        System.out.println(result);
    }

    // Check Prime Number!
    static int isCheck(boolean[] primeNum, int N, int K){
        int cnt = 0;

        for(int i = 2; i <= N; i++) {
            for(int j = i; j <= N; j += i) {
                if(!primeNum[j]) {
                    continue;
                }

                primeNum[j] = false;
                cnt++;
                if(cnt == K) {
                    return j;
                }
            }
        }
        return -1;
    }
}