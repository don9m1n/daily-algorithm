package progammers.level2;

import java.util.LinkedHashSet;
import java.util.Set;

// 소수 찾기 [DFS]
public class PG42839 {

    static Set<Integer> set = new LinkedHashSet<>();
    static boolean[] visited = new boolean[7];


    public static void main(String[] args) {
        System.out.println(solution("17"));

    }

    static int solution(String numbers) {
        int answer = 0;

        dfs(numbers, "", 0);

        for (int number : set) {
            if (isPrime(number)) {
                answer++;
            }
        }

        return answer;
    }

    // recursive
    private static void dfs(String numbers, String comb , int depth) {

        if (depth >= numbers.length()) {
            return;
        }

        for (int i = 0; i < numbers.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                set.add(Integer.parseInt(comb + numbers.charAt(i)));
                dfs(numbers, comb + numbers.charAt(i), depth + 1);

                // return 되고 실행되는 부분
                visited[i] = false;
            }

        }
    }

    private static boolean isPrime(int number) {

        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;

    }


}
