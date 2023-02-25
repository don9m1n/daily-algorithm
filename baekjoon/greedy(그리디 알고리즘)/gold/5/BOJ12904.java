package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// A와 B
public class BOJ12904 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder t = new StringBuilder(br.readLine());

        while (t.length() > s.length()) {
            int lastIndex = t.length() - 1;
            if (t.charAt(lastIndex) == 'A') {
                t.deleteCharAt(t.length() - 1);
            } else {
                t.reverse();
                t.deleteCharAt(0);
            }
            System.out.println(t);
        }

        System.out.println(t.toString().equals(s) ? 1 : 0);
    }
}
