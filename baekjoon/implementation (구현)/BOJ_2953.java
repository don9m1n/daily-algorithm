package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 나는 요리사다
public class BOJ_2953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];

        for(int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int result = 0;
            while(st.hasMoreTokens()) {
                result += Integer.parseInt(st.nextToken());
            }
            arr[i] = result;
        }

        int max = arr[0];
        int winner = 1;
        for(int i = 1; i < 5; i++) {
            if(arr[i] > max) {
                max = arr[i];
                winner = i + 1;
            }
        }
        System.out.print(winner + " " + max);
    }
}