package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 문자열 반복
public class BOJ2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int repeat = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            System.out.println(repeatString(repeat, str));
        }
    }

    private static String repeatString(int repeat, String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < repeat; j++) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
