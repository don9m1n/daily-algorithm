package baekjoon.hashing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 베스트셀러
public class BOJ1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        String result = "";
        int max = 0;
        List<String> keys = new ArrayList<>(map.keySet());
        keys.sort((k1, k2) -> k1.compareTo(k2));
        for (String key : keys) {
            if (map.get(key) > max) {
                max = map.get(key);
                result = key;
            }
        }

        System.out.println(result);
    }
}
