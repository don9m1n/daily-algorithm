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
        List<Integer> pack = new ArrayList<Integer>();

        for(int i=0; i<N; i++) {
            pack.add(i, Integer.parseInt(br.readLine()));
        }

        //pack.sort(Collections.reverseOrder());

        int sum = 0;

        int j = -1;
        int cnt = 0;
        // FEEDBACK: 조건에서 3번 째 가격을 빼는 게 아니라 3개의 값 중에서 가장 작은 값을 빼야함!!
        while(true) {
            j++;

            if(cnt == 3) {
                cnt = 0;
                continue;
            }

            sum += pack.get(j);
            cnt++;

            if(j == pack.size() - 2) {
                break;
            }
        }
        System.out.println(sum);
    }
}
