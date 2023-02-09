package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 세탁소 사장 동혁
public class BOJ2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int money = Integer.parseInt(br.readLine());

            int q = money / 25;
            money %= 25;
            int d = money / 10;
            money %= 10;
            int n = money / 5;
            money %= 5;
            int p = money;

            System.out.println(q+" "+d+" "+n+" "+p);
        }
    }
}
