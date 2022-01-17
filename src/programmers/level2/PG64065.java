package programmers.level2;

import java.util.*;

// 튜플 [2019 카카오 개발자 겨울 인턴십]
/**
 * Feedback: 문제 해결 방법은 잘 생각했으나 구현이 부족했다...
 */
public class PG64065 {

    public static void main(String[] args) {
        int[] solution = solution("{{1,2,3},{2,1},{1,2,4,3},{2}}");
        System.out.println(Arrays.toString(solution));
    }

    public static int[] solution(String s) {

        s = s.substring(2);
        s = s.substring(0, s.length() - 2).replace("},{", "-");

        String[] strArr = s.split("-");
        Arrays.sort(strArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        List<Integer> list = new ArrayList<>();
        for (String str : strArr) {
            for (String strNum : str.split(",")) {
                int num = Integer.parseInt(strNum);
                if(!list.contains(num)) {
                    list.add(num);
                }
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}