package programmers.level1.success;

// 나머지가 1이 되는 수 찾기
public class PG87389 {
    public static void main(String[] args) {
        int solution = solution(10);
        System.out.println("solution = " + solution);
    }

    public static int solution(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 1) {
                return i;
            }
        }
        return 0;
    }
}
