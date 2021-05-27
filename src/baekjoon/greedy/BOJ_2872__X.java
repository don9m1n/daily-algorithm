package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 우리집엔 도서관이 있어
// FEEDKBACK: 배열 사용해서 풀 수 있음!!
public class BOJ_2872__X {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        System.out.println(list.toString());
    }
}
