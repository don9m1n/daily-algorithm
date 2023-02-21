package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 문자열 집합
public class BOJ14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = br.readLine();
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            for (int j = 0; j < s.length; j++) {
                if (str.equals(s[j])) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
