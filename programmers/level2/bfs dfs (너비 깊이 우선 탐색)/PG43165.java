package programmers.level2;

// 타겟 넘버 [DFS/BFS]
public class PG43165 {

    static int answer = 0; // 결과

    public static void main(String[] args) {
        int[] numbers = {4, 1, 2, 1};
        int target = 4;

        int solution = solution(numbers, target);
        System.out.println("solution = " + solution);
    }

    public static int solution(int[] numbers, int target) {
        dfs(numbers, 0, target, 0);
        return answer;
    }

    public static void dfs(int[] numbers, int depth, int target, int sum) {
        if (depth == numbers.length) { // 마지막 노드까지 탐색한 경우
            if(target == sum) { // 타겟 넘버와 결과값이 같다면
                answer++;
            }
        } else {
            dfs(numbers, depth + 1, target, sum + numbers[depth]);
            dfs(numbers, depth + 1, target, sum - numbers[depth]); // 첫 번쨰 인덱스가 음수인 경우가 있음!
        }
    }
}
