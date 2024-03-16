package progammers.level2;

import java.util.ArrayList;
import java.util.List;

// 모음 사전
public class PG_84512 {

    static List<String> list = new ArrayList<>();
    static String[] arr;

    public static void main(String[] args) {
        System.out.println(solution("AAAAE"));
        System.out.println(solution("AAAE"));
    }

    static int solution(String word) {
        int answer = 0;

        arr = new String[]{"A", "E", "I", "O", "U"};
        recursion("", 0);

        for (int i = 0; i < list.size(); i++) {
            if (word.equals(list.get(i))) {
                answer = i;
                break;
            }
        }

        return answer;
    }

    private static void recursion(String str, int depth) {
        list.add(str);

        if (depth == 5) {
            return;
        }

        for (int i = 0; i < 5; i++) {
            recursion(str + arr[i], depth + 1);
        }
    }
}
