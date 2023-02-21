package baekjoon.hashing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

// 문자열 집합
public class BOJ14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(br.readLine(), i + 1);
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            String key = br.readLine();
            if (map.containsKey(key)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
