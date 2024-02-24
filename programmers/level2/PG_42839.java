package progammers.level2;

import java.util.HashSet;
import java.util.Set;

// 소수 찾기
public class PG_42839 {

    static Set<Integer> set;

    public static void main(String[] args) {
        System.out.println(solution("17"));
        //System.out.println(solution("011"));
    }

    static int solution(String numbers) {
        set = new HashSet<>();
        recursive("", numbers);

        System.out.println(set);
        int count = 0;
        for (int number : set) {
            if (isPrime(number)) {
                count++;
            }
        }

        return count;
    }

    // comb: 지금까지 조합된 숫자
    // others: 남은 숫자
    static void recursive(String comb, String others) {

        System.out.println("recursive(" + comb + ", " + others + ")");
        // 1. 현재 조합을 set에 추가한다.
        if (!comb.isEmpty()) {
            set.add(Integer.valueOf(comb));
        }

        // 2. 남은 숫자 중 한개를 더해 새로운 조합을 만든다.
        for (int i = 0; i < others.length(); i++) {
            recursive(comb + others.charAt(i), others.substring(0, i) + others.substring(i + 1));
        }
    }

    static boolean isPrime(int number) {
        // 1. 0, 1은 소수가 아니다.
        if (number == 0 || number == 1) {
            return false;
        }

        for (int i = 2; i <= (int) Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }

        return true;
    }
}
