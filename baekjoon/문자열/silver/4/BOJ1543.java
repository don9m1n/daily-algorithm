package baekjoon.bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문서 검색 [실버4]
public class BOJ1543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        String keyword = br.readLine();

        word = word.replaceAll(keyword, "X");

        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'X') {
                count++;
            }
        }

        System.out.println(count);

    }
}
