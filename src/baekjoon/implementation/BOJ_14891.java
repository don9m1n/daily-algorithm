package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 톱니바퀴
public class BOJ_14891 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] wheel = new int[4][8];

        // 1. 톱니바퀴 배열 만들고 값 세팅??!
        for(int i=0; i<4; i++) {
            String str = br.readLine();
            for(int j=0; j<8; j++) {
                wheel[i][j] = str.charAt(j) - 48;
            }
        }

        int K = Integer.parseInt(br.readLine());
        for(int i=0; i<K; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int gn = Integer.parseInt(st.nextToken()); // 톱니바퀴 번호
            int d = Integer.parseInt(st.nextToken()); // 방향
        }

        // 2. 최종 점수 계산
        int result = 0;
        if(wheel[0][0] == 1){
            result += 1;
        }
        if(wheel[1][0] == 1) {
            result += 2;
        }
        if(wheel[2][0] == 1) {
            result += 4;
        }
        if(wheel[3][0] == 1) {
            result += 8;
        }

        System.out.println(result);
    }
}
