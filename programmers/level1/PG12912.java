package programmers.level1.success;

// 두 정수 사이의 합
public class PG12912 {
    public static void main(String[] args) {
        solution(5, 3);
    }

    public static long solution(int a, int b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);

        long sum = 0L;
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        return sum;
    }
}
