package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class BOJ_2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        double[] money = {0.25, 0.10, 0.05, 0.01};

        for(int i=0; i<T; i++) {
            BigDecimal C = new BigDecimal(String.valueOf(Integer.parseInt(br.readLine()) / 100.0));
            int[] cnt = new int[4];

            for(int j=0; j<cnt.length; j++) {
                BigDecimal bc = new BigDecimal(String.valueOf(money[j]));
                while(C.compareTo(bc) >= 0) {
                    C = C.subtract(bc);
                    cnt[j]++;
                }
            }
            System.out.println(cnt[0] + " " + cnt[1] + " " + cnt[2] + " "  + cnt[3]);
        }
    }
}
