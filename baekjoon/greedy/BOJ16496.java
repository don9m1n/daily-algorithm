package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 큰 수 만들기
public class BOJ16496 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(st.nextToken());
        }

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String num1 = s1 + s2;
                String num2 = s2 + s1;
                if (s2.contains(s1)) {
                    if (Long.parseLong(num1) >= Long.parseLong(num2)) { // int로 받는 경우 NumberFormatException
                        return s1.compareTo(s2);
                    }
                } else if(s1.contains(s2)) {
                    if (Long.parseLong(num2) > Long.parseLong(num1)) {
                        return s1.compareTo(s2);
                    }
                }
                return s2.compareTo(s1);
            }
        });

        System.out.println(result(list));
    }

    private static String result(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (String num : list) {
            sb.append(num);
        }

        if(sb.toString().startsWith("0")) {
            return "0";
        } else {
            return sb.toString();
        }
    }
}