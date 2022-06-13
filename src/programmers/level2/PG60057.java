package programmers.level2.success;

import java.util.ArrayList;
import java.util.List;

// 문자열 압축
public class PG60057 {
    public static void main(String[] args) {
        int solution = solution("a");
        System.out.println("solution = " + solution);
    }

    public static int solution(String s) {

        if (s.length() == 1) {
            return 1;
        }

        int min = 1000;
        // 단어 길이의 반까지 잘라서 검사
        for (int i = 1; i <= s.length() / 2; i++) {
            List<String> list = new ArrayList<>();
            for (int j = 0; j < s.length(); j+=i) {
                int end = j + i;
                if (end > s.length()) {
                    list.add(s.substring(j));
                }else {
                    list.add(s.substring(j, end));
                }
            }

            int compress = compString(list); // 압축된 문자의 길이
            min = Math.min(min, compress);
        }

        return min;
    }

    // 압축한 문자열의 길이를 리턴!!
    private static int compString(List<String> list) {
        StringBuilder sb = new StringBuilder(); // 최종 압축 문자!

        for (int i = 0; i < list.size(); i++) {
            int level = 1; // 문자의 압축 레벨 표시
            String target = list.get(i); // 타겟 문자

            while (true) {
                if ((i == list.size() - 1) || !(target.equals(list.get(i + 1)))) {
                    if(level == 1) sb.append(target);
                    else sb.append(level).append(target);
                    break;
                } else {
                    level++;
                    i++;
                }
            }
        }
        return sb.length();
    }
}