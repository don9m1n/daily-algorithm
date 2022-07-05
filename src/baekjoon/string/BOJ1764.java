package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()); // 듣도 못한 사람 수
        int m = Integer.parseInt(st.nextToken()); // 보도 못한 사람 수

        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map1.put(br.readLine(), i);
        }

        for (int i = 0; i < m; i++) {
            map2.put(br.readLine(), i);
        }

        if(map2.size() < map1.size()) {
            Map<String, Integer> tmp = map1;
            map1 = map2;
            map2 = tmp;
        }

        int count = 0;
        List<String> list = new ArrayList<>();

        for (String key : map1.keySet()) {
            if(map2.containsKey(key)) {
                count++;
                list.add(key);
            }
        }

        Collections.sort(list);
        System.out.println(count);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
