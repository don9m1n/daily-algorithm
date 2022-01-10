package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 전자레인지
public class BOJ10162 {

    static int[] time = {300, 60, 10};
    static int[] count = new int[3];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        System.out.println(controlMinimumButton(t));
    }

    private static String controlMinimumButton(int t) {
        if(t % 10 != 0) {
            return "-1";
        }

        for (int i = 0; i < time.length; i++) {
            while(time[i] <= t) {
                t -= time[i];
                count[i]++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count.length; i++) {
            sb.append(count[i]).append(" ");
        }

        return sb.toString();
    }
}
