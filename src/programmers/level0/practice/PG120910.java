package programmers.level0.practice;

// 세균 증식
public class PG120910 {
    public static void main(String[] args) {
        int solution = solution(7, 15);
        System.out.println("solution = " + solution);
    }

    public static int solution(int n, int t) {
        int sum = n;
        for (int i = 0; i < t; i++) {
            sum *= 2;
        }
        return sum;
    }
}
