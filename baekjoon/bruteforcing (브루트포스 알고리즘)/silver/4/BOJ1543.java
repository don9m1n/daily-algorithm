package baekjoon.bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문서 검색 [실버4]
public class BOJ1543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder word = new StringBuilder(br.readLine());
        String keyword = br.readLine();

        int i = 0;
        int count = 0;

        while((i = word.indexOf(keyword)) != -1) {
            word.delete(0, i + keyword.length());
            count++;
        }

        System.out.println(count);

    }
}
