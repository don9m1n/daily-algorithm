package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 알파벳 개수
public class BOJ_10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] cnt = new int[26];

        for(int i=0; i<str.length(); i++) {
            int index = (int)str.charAt(i) - 97;
            cnt[index]++;
        }

        for(int i : cnt) {
            System.out.print(i + " ");
        }

    }
}
