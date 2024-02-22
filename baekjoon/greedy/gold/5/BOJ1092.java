package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 배
public class BOJ1092 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        List<Integer> crane = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        st  = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            crane.add(Integer.parseInt(st.nextToken()));
        }

        List<Integer> box = new ArrayList<>();
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            box.add(Integer.parseInt(st.nextToken()));
        }

        crane.sort(Collections.reverseOrder());
        box.sort(Collections.reverseOrder());

        if (crane.get(0) < box.get(0)) {
            System.out.println(-1);
            return;
        }

        int minute = 0;
        while (!box.isEmpty()) {
            int index = 0;
            for (int i = 0; i < crane.size();) {
                if (index == box.size()) {
                    break;
                }
                if (crane.get(i) >= box.get(index)) {
                    box.remove(index);
                    i++;
                } else {
                    index++;
                }
            }
            minute++;
        }
        System.out.println(minute);
    }
}
