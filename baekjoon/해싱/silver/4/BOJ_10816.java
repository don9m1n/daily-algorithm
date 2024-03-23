package baekjoon.hashing.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// 숫자 카드2
public class BOJ_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<Integer, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            int card = Integer.parseInt(st.nextToken());
            map.put(card, map.getOrDefault(card, 0) + 1);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (st.hasMoreTokens()) {
            int card = Integer.parseInt(st.nextToken());
            sb.append(map.getOrDefault(card, 0)).append(" ");
        }

        System.out.println(sb);
    }
}
