package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// A -> B
public class BOJ_16953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int cnt = 1;

        while(A != B) {
            // A를 B로 바꿀 수 없는 경우...?
            if(((B % 2 != 0) && (B % 10 != 1)) || B < A) {
                System.out.println(-1);
                return;
            }

            if(B % 2 == 0) {
                B /= 2;
            }else if(B % 10 == 1){
                B /= 10;
            }

            cnt++;
        }
        System.out.println(cnt);
    }
}