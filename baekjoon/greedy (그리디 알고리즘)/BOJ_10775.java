package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 공항
public class BOJ_10775 {
    static int G;
    static int P;
    static boolean[] gate;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        G = Integer.parseInt(br.readLine());
        P = Integer.parseInt(br.readLine());
        gate = new boolean[G+1];

        int cnt = 0;

        for(int i=0; i<P; i++) {
            int g = isPlane(Integer.parseInt(br.readLine())); // 게이트 범위

            if(g == -1) break;
            else {
                gate[g] = true;
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    static int isPlane(int n) {
        for(int i=n; i>0; i--) {
            if(!gate[i]) {
                return i;
            }
        }
        return -1;
    }
}