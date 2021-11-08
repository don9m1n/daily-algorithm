package programmers.level2;

import java.util.*;

// 전화번호 목록 [해시]
public class PG42577 {

    public static void main(String[] args) {
        boolean solution = solution(new String[]{"222", "111", "332223"});
        System.out.println("solution = " + solution);
    }

    public static boolean solution(String[] phone_book) {

        Arrays.sort(phone_book);
        // startsWith() 사용해서 접두사 체크 해도됨
        for (int i = 0; i < phone_book.length - 1; i++) {
            if(phone_book[i + 1].indexOf(phone_book[i]) == 0) {
                return false;
            }
        }
        return true;
    }
}