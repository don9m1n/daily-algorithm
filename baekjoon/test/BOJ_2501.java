package baekjoon.test.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 약수 구하기
public class BOJ_2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        br.close();
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= N; i++) {
            if(N % i == 0) {
                list.add(i);
            }
        }

        if(list.size() < K) {
            System.out.println(0);
            return;
        }

        Collections.sort(list);
        System.out.println(list.get(K-1));
    }
}
