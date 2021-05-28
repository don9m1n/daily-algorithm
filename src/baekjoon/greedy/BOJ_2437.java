package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 저울
public class BOJ_2437_저울 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] weight = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++) {
            weight[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(weight);
        if(weight[0] != 1) {
            System.out.println(1);
            return;
        }

        int sum = weight[0];
        for(int i=1; i<N; i++) {
            if(weight[i] > sum + 1) {
                System.out.println(sum + 1);
                return;
            }
            sum += weight[i];
        }

        System.out.println(sum + 1);
    }
}
