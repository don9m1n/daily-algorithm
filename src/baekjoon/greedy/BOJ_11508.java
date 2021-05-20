package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 2 + 1 세일
public class BOJ_11508 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Integer[] pack = new Integer[N];

        for(int i=0; i<N; i++) {
            pack[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(pack, Collections.reverseOrder());

        int sum = 0;

        int j = -1;
        int cnt = 0;
        int min = pack[0]; // 최소 가격

        while(true) {
            j++;

            if(pack[j] < min) {
                min = pack[j];
            }

            sum += pack[j];
            cnt++;

            if(cnt == 3) {
                sum -= min;
                if(pack.length > cnt + 1) {
                    min = pack[cnt+1];
                }
                cnt = 0;
            }

            if(j == pack.length-1) {
                break;
            }
        }
        System.out.println(sum);
    }
}
