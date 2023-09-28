package progammers.level2;

import java.util.LinkedList;
import java.util.Queue;

// 숫자의 표현
public class PG12924 {
    public static void main(String[] args) {
        System.out.println(solution(15));
        System.out.println(solution(3));
    }

    static int solution(int n) {
        int count = 1;
        Queue<Integer> q = new LinkedList<>();

        int sum = 0;
        int i = 1;
        while (i <= n) {
            if (sum < n) {
                sum += i;
                q.add(i++);
            } else if (sum == n) {
                count++;
                sum -= q.poll();
            } else {
                sum -= q.poll();
            }
        }

        return count;
    }
}
