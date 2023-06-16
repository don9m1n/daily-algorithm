package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 윷놀이
public class BOJ_2490 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] cnt = new int[2];
        for(int i=0; i<3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            while(st.hasMoreTokens()) {
                int num = Integer.parseInt(st.nextToken());
                if (num == 0) {
                    cnt[0]++;
                } else if (num == 1) {
                    cnt[1]++;
                }
            }

            switch (cnt[0]) {
                case 1:
                    System.out.println("A");
                    break;
                case 2:
                    System.out.println("B");
                    break;
                case 3:
                    System.out.println("C");
                    break;
                case 4:
                    System.out.println("D");
                    break;
                default:
                    System.out.println("E");
            }

            cnt[0] = 0;
            cnt[1] = 0;
        }
    }
}
