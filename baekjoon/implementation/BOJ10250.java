package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// ACM 호텔
public class BOJ10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            int solution = findRoom(h, w, n);
            System.out.println(solution);
        }
    }

    private static int findRoom(int h, int w, int n) throws IOException {

        int cnt = 1;
        for (int x = 1; x <= w; x++) {
            for (int y = 1; y <= h; y++) {
                if (cnt == n) {
                    return y * 100 + x;
                }
                cnt++;
            }
        }
        return -1;
    }
}
