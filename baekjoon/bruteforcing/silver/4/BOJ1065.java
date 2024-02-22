package baekjoon.bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// 한수
public class BOJ1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if(i < 100 || checkHanSu(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    // 한수 판별 메서드
    private static boolean checkHanSu(int num) {
        List<Integer> list = new ArrayList<>();
        while (num > 0) {
            list.add(num % 10);
            num /= 10;
        }

        int diff = list.get(0) - list.get(1); // 초기 등차
        for (int i = 1; i < list.size() - 1; i++) {
            if (list.get(i) - list.get(i + 1) != diff) {
                return false;
            }
        }
        return true;
    }
}
