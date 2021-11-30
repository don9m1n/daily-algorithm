package programmers.level2;

import java.util.ArrayList;
import java.util.List;

// 124 나라의 숫자 [연습문제]
public class PG12899 {

    public static void main(String[] args) {
        String solution = solution(2);
        System.out.println("solution = " + solution);
    }

    public static String solution(int n) {

        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();

        while(true) {
            int q = n / 3;
            int r = n % 3;

            if(r == 0) {
                q = q - 1;
                r = r + 3;
            }

            list.add(r);

            if(q > 3) {
                n = q;
            }else {
                list.add(q);
                break;
            }
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            if(list.get(i) == 0) continue;
            if(list.get(i) == 3) {
                sb.append(4);
            }else {
                sb.append(list.get(i));
            }
        }

        return sb.toString();
    }
}
