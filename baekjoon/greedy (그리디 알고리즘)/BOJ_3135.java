package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 라디오
public class BOJ_3135 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int min_diff = 1000; // 최소 차이값
        int index = 0; // index

        for(int i=0; i<N; i++) {
            int diff = Math.abs(B - arr[i]);
            if(min_diff > diff) {
                min_diff = diff;
                index = i; // B와 즐겨찾기 버튼의 값 중 차이가 가장 적은 인덱스 찾기
            }
        }

        int cnt = Math.min(Math.abs(A - B), Math.abs(arr[index] - B) + 1);
        System.out.println(cnt);

    }
}
