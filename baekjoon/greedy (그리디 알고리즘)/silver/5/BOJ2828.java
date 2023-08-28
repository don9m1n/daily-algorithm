package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 사과 담기 게임
public class BOJ2828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int j = Integer.parseInt(br.readLine());

        int left = 0;
        int right = left + m - 1;

        int sum = 0;
        for (int i = 0; i < j; i++) {
            int apple = Integer.parseInt(br.readLine()) - 1;
            if (apple < left) {
                int diff = left - apple;
                sum += diff;
                left -= diff;
                right -= diff;
            } else if (apple > right) {
                int diff = apple - right;
                sum += diff;
                left += diff;
                right += diff;
            }
        }
        System.out.println(sum);
    }
}
