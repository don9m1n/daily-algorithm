package programmers.level1.success;

import java.util.Arrays;

// 이상한 문자 만들기
public class PG12930 {
    public static void main(String[] args) {
        String solution = solution("TRY HELLO WORLD  ");
        System.out.println("solution = " + solution);
    }

    public static String solution(String s) {
        s = s.toUpperCase();
        String[] strArr = s.split(" ", -1);
        System.out.println(Arrays.toString(strArr));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr[i].length(); j++) {
                if(strArr[i].charAt(j) == ' ') {
                    sb.append(" ");
                    continue;
                }
                if(j % 2 != 0) {
                    sb.append((char)(strArr[i].charAt(j) + 32));
                }else {
                    sb.append(strArr[i].charAt(j));
                }
            }
            if(i != strArr.length - 1) sb.append(" ");
        }
        return sb.toString();
    }
}