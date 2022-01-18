package programmers.level2;

import java.util.ArrayList;
import java.util.List;

// 문자열 압축 ... 거의 다 풀었다....
public class PG60057X {
    public static void main(String[] args) {
        int solution = solution("abcabcdede");
        System.out.println("solution = " + solution);
    }

    public static int solution(String s) {

        int min = s.length();

        for (int i = 0; i < s.length() / 2; i++) {
            List<String> list = new ArrayList<>();
            int j = 0;
            while(j < s.length()) { // 문자열 자르기 1 ~ s.length() / 2 번 까지 차례대로 자름
                if (j + 1 + i > s.length()) {
                    list.add(s.substring(j, s.length()));
                    j += s.length() - j;
                }else {
                    list.add(s.substring(j, j + 1 + i));
                    j += i + 1;
                }
            }
        }
        return 0;
    }
}