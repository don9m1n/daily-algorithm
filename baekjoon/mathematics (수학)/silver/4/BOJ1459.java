package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 걷기
public class BOJ1459 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long x = Integer.parseInt(st.nextToken());
        long y = Integer.parseInt(st.nextToken());
        long w = Integer.parseInt(st.nextToken());
        long s = Integer.parseInt(st.nextToken());

        long result = (x + y) * w;

        if ((x + y) % 2 == 0) {
            result = Math.min(result, Math.max(x, y) * s);
        } else {
            result = Math.min(result, (Math.max(x, y) - 1) * s + w);
        }

        result = Math.min(result, (Math.min(x, y)) * s + (Math.abs(x - y)) * w);
        System.out.println(result);
    }
}
