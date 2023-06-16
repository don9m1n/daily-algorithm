package baekjoon.greedy.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 컵홀더
public class BOJ_2810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int cnt = 1; // 컵 홀더의 개수
        int lCnt = 0; // 커플석을 구별하기 위한 변수
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'S') {
                cnt++;
            }
            else if(s.charAt(i) == 'L') {
                lCnt++;
                if(lCnt == 2) {
                    cnt++;
                    lCnt = 0;
                }
            }
        }
        int result = Math.min(N, cnt);
        System.out.println(result);
    }
}
