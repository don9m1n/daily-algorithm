package programmers.level1.success;

// 정수 제곱근 판별
public class PG12934 {
    public static void main(String[] args) {
        long solution = solution(121);
        System.out.println("solution = " + solution);
    }

    public static long solution(long n) {
        for (int i = 1; i <= (long) Math.sqrt(n); i++) {
            if ((long) Math.pow(i, 2) == n) {
                return (long) Math.pow(i + 1, 2);
            }
        }
        return -1;
    }
}
