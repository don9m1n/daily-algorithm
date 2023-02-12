package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 단어 공부
public class BOJ1157 {

    static int[] count = new int[26];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().toUpperCase();

        for (int i = 0; i < word.length(); i++) {
            count[word.charAt(i) - 65]++;
        }

        int max = 0;
        for (int c : count) {
            if (c == 0) continue;
            max = Math.max(max, c);
        }

        int sameCount = 0;
        int idx = 0;
        for (int i = 0; i < count.length; i++) {
            if(count[i] == max) {
                sameCount++;
                idx = i;
            }
        }

        if (sameCount >= 2) {
            System.out.println("?");
        } else {
            System.out.println((char)(idx + 65));
        }
    }
}
