package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 아우으 우아으이야!!
public class BOJ_15922 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int x1, y1, x2, y2; // 각 좌표값

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        x1 = Integer.parseInt(st.nextToken());
        y1 = Integer.parseInt(st.nextToken());
        int sum = 0;

        for(int i=0; i<N-1; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());

            if(y1 >= y2) {
                continue;
            }else if(y1 >= x2) {
                y1 = y2;
            }else {
                sum += Math.abs(y1 - x1);
                x1 = x2;
                y1 = y2;
            }
        }
        sum+=Math.abs(y1-x1);
        System.out.println(sum);
    }
}
