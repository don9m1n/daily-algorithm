package progammers.level1;

// 콜라 문제
public class PG132267 {
    public static void main(String[] args) {
        System.out.println(solution(2, 1, 20));
        System.out.println(solution(3, 1, 20));
        System.out.println(solution(2, 1, 2));
        System.out.println(solution(2, 1, 3));
        System.out.println(solution(5, 3, 21));
    }

    static int solution(int a, int b, int n) {
        int sum = 0;
        while (n >= a) {
            sum += (n / a) * b;
            n = (n % a) + (n / a) * b;
        }
        return sum;
    }
}
