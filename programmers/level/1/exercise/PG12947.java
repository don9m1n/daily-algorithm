package programmers.level1.success;

// 하샤드 수
public class PG12947 {
    public static void main(String[] args) {
        boolean solution = solution(11);
        System.out.println("solution = " + solution);
    }

    public static boolean solution(int x) {
        int num = x;
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }

        return num % sum == 0;
    }
}
