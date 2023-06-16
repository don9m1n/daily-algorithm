package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 수 묶기
public class BOJ1744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Integer> plus = new ArrayList<>(); // 양수 저장
        List<Integer> minus = new ArrayList<>(); // 음수 저장
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num > 0) {
                plus.add(num);
            } else {
                minus.add(num);
            }
        }

        plus.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        Collections.sort(minus);

        int sum = 0;
        int i = 0;
        while (i < plus.size()) {
            if (i + 1 < plus.size() && plus.get(i) != 1 && plus.get(i + 1) != 1)
                sum += plus.get(i++) * plus.get(i++);
            else
                sum += plus.get(i++);
        }

        i = 0;
        while (i < minus.size()) {
            if (i + 1 < minus.size() && minus.get(i) != 1 && minus.get(i + 1) != 1)
                sum += minus.get(i++) * minus.get(i++);
            else
                sum += minus.get(i++);
        }

        System.out.println(sum);
    }
}