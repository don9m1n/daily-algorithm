package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

// 지능형 기차
public class BOJ_2455__O {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int max = Math.abs(Integer.parseInt(st.nextToken()) - Integer.parseInt(st.nextToken()));

        int result = 0;
        for(int i=1; i<4; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            max -= Integer.parseInt(st.nextToken()) - Integer.parseInt(st.nextToken());
            if(max > result) {
                result = max;
            }
        }
        System.out.println(result);
    }
}
