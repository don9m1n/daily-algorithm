package baekjoon.greedy.unsolve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 크게 만들기
public class BOJ_2812 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); // 숫자 자릿수
        int K = Integer.parseInt(st.nextToken()); // 지울 숫자의 개수

        StringBuilder sb = new StringBuilder(br.readLine());

        /**
         * 해당 자릿수부터 검사
         * 뒷 자릿수들을 돌면서 자기보다 큰 숫자가 있으면 삭제
         */

        int flag = 0;
        while(K > 0) {
            for (int i = 0; i < sb.length() - 1; i++) {
                if (sb.charAt(flag) < sb.charAt(flag + 1) || (i==0 && sb.charAt(flag) > sb.charAt(flag + 1) )) {
                    sb.deleteCharAt(flag);
                    K--;
                }else {
                    flag += 1;
                }

                if(flag == sb.length() - 1) break;
            }
        }
        System.out.println(sb.toString());
    }
}
