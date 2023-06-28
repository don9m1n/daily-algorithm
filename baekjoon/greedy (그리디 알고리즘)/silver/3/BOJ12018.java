package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// Yonsei TOTO [실버3]
public class BOJ12018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] members = new int[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());

            int[] arr = new int[p];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < p; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            if(p > l) {
                members[i] = arr[p - l];
            } else if (p < l) {
                members[i] = 1;
            } else if (p == l) {
                members[i] = arr[0];
            }
        }

        Arrays.sort(members);

        int count = 0;
        for (int i = 0; i < n; i++) {
            m -= members[i];

            if (m < 0) {
                break;
            }

            count++;
        }

        System.out.println(count);
    }
}
