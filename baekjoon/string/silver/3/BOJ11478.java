package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;

// 서로 다른 부분 문자열의 개수
public class BOJ11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        Set<String> result = new LinkedHashSet<>();
        for (int i = 1; i < str.length(); i++) {
            for (int j = 0; j <= str.length() - i; j++) {
                result.add(str.substring(j, i + j));
            }
        }

        System.out.println(result.size() + 1);
    }
}
