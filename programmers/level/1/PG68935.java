package programmers.level1.success;

import java.util.ArrayList;
import java.util.List;

// 3진법 뒤집기
public class PG68935 {
    public static void main(String[] args) {
        int solution = solution(125);
        System.out.println("solution = " + solution);
    }

    public static int solution(int n) {

        List<Integer> list = new ArrayList<>();

        while (n > 0) {
            list.add(n % 3);
            n /= 3;
        }

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += (list.get(i) * Math.pow(3, list.size() - 1 - i));
        }

        return sum;
    }
}
