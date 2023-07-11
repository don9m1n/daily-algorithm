package roadmap.part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 빗물
public class BOJ14719 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        int[] height = new int[w];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < w; i++) {
            height[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        for (int i = 1; i < w - 1; i++) {
            int current = height[i];
            int left = 0;
            int right = 0;

            for (int j = 0; j < i; j++) {
                left = Math.max(left, height[j]);
            }

            for (int j = w - 1; j >= i; j--) {
                right = Math.max(right, height[j]);
            }

            if (current < left && current < right) {
                sum += Math.min(left, right) - current;
            }
        }

        System.out.println(sum);
    }
}
