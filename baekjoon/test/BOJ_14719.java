package baekjoon.test.warm_up2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 빗물
public class BOJ_14719 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int[] map = new int[W];
        int cnt = 0;

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < W; i++) {
            map[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i < W - 1; i++) { // 양끝은 물이 채워지지 않음
            int current = map[i];
            int leftMax = current;
            int rightMax = current;

            // 왼쪽 최대벽 높이 탐색
            for(int j = i -1; j >= 0; j--) {
                if(map[j] > current) {
                    leftMax = Math.max(leftMax, map[j]);
                }
            }

            // 오른쪽 최대벽 높이 탐색
            for(int j = i + 1; j < W; j++) {
                if(map[j] > current) {
                    rightMax = Math.max(rightMax, map[j]);
                }
            }

            // 양쪽 벽의 높이가 현재 벽의 높이보다 크다면
            if(Math.min(leftMax, rightMax) > current) {
                cnt += (Math.min(leftMax, rightMax) - map[i]);
            }
        }
        System.out.println(cnt);
    }
}